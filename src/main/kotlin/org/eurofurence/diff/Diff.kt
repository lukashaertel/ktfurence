package org.eurofurence.diff

sealed class Diff<K, V>()

data class DiffAdded<K, V>(val key: K, val value: V) : Diff<K, V>()

data class DiffChanged<K, V>(val key: K, val from: V, val value: V) : Diff<K, V>()

data class DiffRemoved<K, V>(val key: K, val value: V) : Diff<K, V>()


fun <K, V> Map<K, V>.computeDiff(new: Map<K, V>): List<Diff<K, V>> {
    val removed = (keys subtract new.keys).map { DiffRemoved(it, get(it)!!) }
    val changed = (keys intersect new.keys).map { DiffChanged(it, get(it)!!, new.get(it)!!) }
    val added = (new.keys subtract keys).map { DiffAdded(it, new.get(it)!!) }

    return removed + changed + added
}

fun <K, V> MutableMap<K, V>.applyDiff(new: Map<K, V>): List<Diff<K, V>> {
    val result = arrayListOf<Diff<K, V>>()

    val remove = HashMap(this)
    for ((k, v) in new) {
        remove.remove(k)

        val p = put(k, v)
        if (p == null)
            result.add(DiffAdded(k, v))
        else if (p != v)
            result.add(DiffChanged(k, p, v))
    }


    keys.removeAll(remove.keys)
    remove.mapTo(result) { (k, v) -> DiffRemoved(k, v) }


    return result
}