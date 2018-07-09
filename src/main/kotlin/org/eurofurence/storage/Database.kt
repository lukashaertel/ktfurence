package org.eurofurence.storage

import io.reactivex.Flowable
import java.io.*
import java.util.concurrent.TimeUnit
import kotlin.collections.Map.Entry

/**
 * Abstract key value store, similar to map.
 */
interface Store<K, V> {
    /**
     * Removes all values.
     */
    fun clear()

    /**
     * All keys in the store.
     */
    fun keys(): Flowable<K>

    /**
     * All entries in the store.
     */
    fun entries(): Flowable<Entry<K, V>>

    /**
     * All values in the store.
     */
    fun values(): Flowable<V>

    /**
     * Gets one element.
     */
    operator fun get(key: K): V?

    /**
     * Sets one element.
     */
    operator fun set(key: K, value: V): V?

    /**
     * Removes one element.
     */
    fun remove(key: K): Boolean

    /**
     * Get multiple elements.
     */
    fun getAll(keys: List<K>): List<V?>

    /**
     * Set multiple elements.
     */
    fun setAll(association: Map<K, V>): Map<K, V>

    /**
     * Remove multiple elements.
     */
    fun removeAll(keys: List<K>): Boolean

    /**
     * Updates entries via mapping function, returns the amount of changed elements.
     */
    fun update(block: (K, V) -> V): Int

    /**
     * Updates or removes entries via mapping function, returns teh amount of changed and removed elements.
     */
    fun updateOrDrop(block: (K, V) -> V?): Int

    /**
     * Meta value store.
     */
    fun meta(): Store<String, Any>

}

/**
 * Inserts all keys into a hash set.
 */
fun <K> Store<K, *>.keySet() =
        hashSetOf<K>().apply {
            keys().forEach {
                add(it)
            }
        }

/**
 * Associates all key/values into a hash map.
 */
fun <K, V> Store<K, V>.entryMap() =
        hashMapOf<K, V>().apply {
            entries().forEach {
                put(it.key, it.value)
            }
        }

/**
 * Inserts all values into a hash set.
 */
fun <V> Store<*, V>.valueSet() =
        hashSetOf<V>().apply {
            values().forEach {
                add(it)
            }
        }

/**
 * Get operator that supports nullable keys.
 */
operator fun <K : Any, V> Store<K, V>.get(key: K?) =
        if (key == null)
            null
        else
            get(key)

/**
 * Monitors a file modification time. Begins with the current time. If file does not exist, [Long.MIN_VALUE] is used.
 */
fun observeFile(file: File): Flowable<Long> = Flowable.interval(500L, TimeUnit.MILLISECONDS).scan(Long.MIN_VALUE) { a, _ ->
    maxOf(a, if (file.exists()) file.lastModified() else Long.MIN_VALUE)
}.distinctUntilChanged()
