package org.eurofurence.storage

import kotlin.collections.Map.Entry
import kotlin.collections.MutableMap.MutableEntry
import kotlin.properties.Delegates.notNull

/**
 * Converts the store to a map. requires non-nullable keys.
 */
fun <K : Any, V : Any> Store<K, V>.asMap() = object : AbstractMutableMap<K, V>() {
    override val entries: MutableSet<MutableEntry<K, V>>
        get() = object : AbstractMutableSet<MutableEntry<K, V>>() {
            override val size: Int
                get() = this@asMap.entries().count().blockingGet().toInt()

            override fun add(element: MutableEntry<K, V>): Boolean {
                return this@asMap.set(element.key, element.value) != element.value
            }

            override fun iterator(): MutableIterator<MutableEntry<K, V>> {
                val source = this@asMap.entries().blockingIterable().iterator()

                return object : MutableIterator<MutableEntry<K, V>> {
                    private var current by notNull<K>()

                    override fun hasNext(): Boolean {
                        return source.hasNext()
                    }

                    override fun next(): MutableEntry<K, V> {
                        var (key, value) = source.next()
                        this.current = key
                        return object : MutableEntry<K, V> {
                            override val key: K
                                get() = key
                            override val value: V
                                get() = value

                            override fun setValue(newValue: V): V {
                                value = newValue
                                return this@asMap.set(current, newValue) ?: error("Key not assigned")

                            }

                            override fun hashCode(): Int {
                                val prime = 31
                                var result = 1
                                result = prime * result + key.hashCode()
                                result = prime * result + value.hashCode()
                                return result
                            }

                            override fun equals(other: Any?) =
                                    other is Entry<*, *>
                                            && key == other.key
                                            && value == other.value
                        }
                    }

                    override fun remove() {
                        this@asMap.remove(current)
                    }
                }
            }

            override fun addAll(elements: Collection<MutableEntry<K, V>>): Boolean {
                return this@asMap.setAll(elements.associate { it.key to it.value }).isNotEmpty()
            }

            override fun clear() {
                this@asMap.clear()
            }

            override fun contains(element: MutableEntry<K, V>): Boolean {
                return this@asMap.entries().contains(element).blockingGet()
            }

            override fun containsAll(elements: Collection<MutableEntry<K, V>>): Boolean {
                val remaining = elements.toHashSet()
                entries().forEach {
                    remaining.remove(it)
                }
                return remaining.isEmpty()
            }

            override fun isEmpty(): Boolean {
                return this@asMap.keys().isEmpty.blockingGet()
            }

            override fun remove(element: MutableEntry<K, V>): Boolean {
                return this@asMap.updateOrDrop { k, v ->
                    if (k == element.key && v == element.value)
                        null
                    else
                        v
                } > 0
            }

            override fun removeAll(elements: Collection<MutableEntry<K, V>>): Boolean {
                return this@asMap.updateOrDrop { k, v ->
                    if (SimpleEntry(k, v) in elements)
                        null
                    else
                        v
                } > 0
            }
        }

    override fun put(key: K, value: V): V? {
        return this@asMap.set(key, value)
    }
}