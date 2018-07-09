package org.eurofurence.storage

import io.reactivex.Flowable
import kotlinx.serialization.KSerializer
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.SerialContext
import kotlinx.serialization.internal.MapEntrySerializer
import kotlinx.serialization.internal.StringSerializer
import org.eurofurence.serial.BinaryInput
import org.eurofurence.serial.BinaryOutput
import org.eurofurence.serial.LocalDateTimeSerializer
import org.eurofurence.serial.UUIDSerializer
import org.eurofurence.util.transform
import java.io.*
import java.time.LocalDateTime
import java.util.*

/**
 * Store that uses a file as a medium. Mutation work file based and are faster if used coupled in bulk. Mutations are
 * written on an intermediate file to prevent corruption.
 */
class FileStore<K, V>(
        val file: File,
        val keySerializer: KSerializer<K>,
        val valueSerializer: KSerializer<V>,
        val context: SerialContext? = null) : Store<K, V> {

    private val activeContext = SerialContext(context).apply {
        registerSerializer(LocalDateTime::class, LocalDateTimeSerializer)
        registerSerializer(UUID::class, UUIDSerializer)
    }
    private val serializer = MapEntrySerializer(keySerializer, valueSerializer)

    private fun File.acquireInSource() =
            if (exists())
                FileInputStream(this)
            else
                ByteArrayInputStream(byteArrayOf())

    private fun File.acquireIn() =
            BinaryInput(DataInputStream(acquireInSource())).also { it.context = activeContext }

    private fun File.acquireOut() =
            BinaryOutput(DataOutputStream(FileOutputStream(this))).also { it.context = activeContext }

    override fun clear() {
        file.delete()
    }

    override fun keys(): Flowable<K> {
        if (!file.exists())
            return Flowable.empty()

        return Flowable.using({
            file.acquireIn()
        }, { s ->
            Flowable.generate<K> {
                try {
                    if (s.input.available() > 0)
                        it.onNext(serializer.load(s).key)
                    else
                        it.onComplete()
                } catch (t: Throwable) {
                    it.onError(t)
                }
            }
        }, { s ->
            s.close()
        })
    }

    override fun entries(): Flowable<Map.Entry<K, V>> {
        return Flowable.using({
            file.acquireIn()
        }, { s ->
            Flowable.generate<Map.Entry<K, V>> {
                try {
                    if (s.input.available() > 0)
                        it.onNext(serializer.load(s))
                    else
                        it.onComplete()
                } catch (t: Throwable) {
                    it.onError(t)
                }
            }
        }, { s ->
            s.close()
        })
    }

    override fun values(): Flowable<V> {
        return Flowable.using({
            file.acquireIn()
        }, { s ->
            Flowable.generate<V> {
                try {
                    if (s.input.available() > 0)
                        it.onNext(serializer.load(s).value)
                    else
                        it.onComplete()
                } catch (t: Throwable) {
                    it.onError(t)
                }
            }
        }, { s ->
            s.close()
        })
    }

    override fun get(key: K): V? {
        file.acquireIn().use { s ->
            while (s.input.available() > 0) {
                val (k, v) = serializer.load(s)
                if (k == key)
                    return v
            }

            return null
        }
    }

    override fun getAll(keys: List<K>): List<V?> {
        val result = MutableList<V?>(keys.size) { null }
        val targets = keys.withIndex().associate { it.value to it.index }

        return file.acquireIn().use { s ->
            while (s.input.available() > 0) {
                val (k, v) = serializer.load(s)
                val i = targets[k]
                if (i != null)
                    result[i] = v
            }

            result
        }
    }

    override fun set(key: K, value: V): V? {
        return file.transform { src, dst ->
            src.acquireIn().use { s ->
                dst.acquireOut().use { t ->
                    var result: V? = null
                    while (s.input.available() > 0) {
                        val e = serializer.load(s)
                        if (e.key != key)
                            serializer.save(t, e)
                        else
                            result = e.value
                    }

                    serializer.save(t, AbstractMap.SimpleEntry(key, value))
                    result
                }
            }
        }
    }

    override fun setAll(association: Map<K, V>): Map<K, V> {
        return file.transform { src, dst ->
            src.acquireIn().use { s ->
                dst.acquireOut().use { t ->
                    val result = hashMapOf<K, V>()
                    while (s.input.available() > 0) {
                        val e = serializer.load(s)
                        if (e.key !in association)
                            serializer.save(t, e)
                        else
                            result[e.key] = e.value
                    }
                    for (e in association)
                        serializer.save(t, e)
                    result
                }
            }
        }
    }

    override fun update(block: (K, V) -> V): Int {
        return file.transform { src, dst ->
            src.acquireIn().use { s ->
                dst.acquireOut().use { t ->
                    var count = 0
                    while (s.input.available() > 0) {
                        val e = serializer.load(s)
                        val s = block(e.key, e.value)
                        if (e.value != s)
                            count++
                        serializer.save(t, AbstractMap.SimpleEntry(e.key, s))
                    }

                    count
                }
            }
        }
    }

    override fun updateOrDrop(block: (K, V) -> V?): Int {
        return file.transform { src, dst ->
            src.acquireIn().use { s ->
                dst.acquireOut().use { t ->
                    var count = 0
                    while (s.input.available() > 0) {
                        val e = serializer.load(s)
                        val s = block(e.key, e.value)
                        if (e.value != s)
                            count++
                        if (s != null)
                            serializer.save(t, AbstractMap.SimpleEntry(e.key, s))
                    }

                    count
                }
            }
        }
    }


    override fun remove(key: K): Boolean {
        return file.transform { src, dst ->
            src.acquireIn().use { s ->
                dst.acquireOut().use { t ->
                    var removed = false
                    while (s.input.available() > 0) {
                        val e = serializer.load(s)
                        if (e.key == key) {
                            removed = true
                        } else {
                            serializer.save(t, e)
                        }
                    }

                    removed
                }
            }
        }
    }

    override fun removeAll(keys: List<K>): Boolean {
        return file.transform { src, dst ->
            src.acquireIn().use { s ->
                dst.acquireOut().use { t ->
                    var removed = false
                    while (s.input.available() > 0) {
                        val e = serializer.load(s)
                        if (e.key !in keys) {
                            removed = true
                            serializer.save(t, e)
                        }
                    }

                    removed
                }
            }
        }
    }

    private val meta by lazy {
        FileStore(File(file.parentFile, file.name + ".meta"),
                StringSerializer,
                PolymorphicSerializer)
    }

    override fun meta(): Store<String, Any> {
        return meta
    }
}