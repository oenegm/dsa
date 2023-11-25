package org.oenegm.list

interface List<T> {
    fun getLength(): Int
    fun insertAt(item: T, index: Int)
    fun remove(item: T): T?
    fun removeAt(index: Int): T?
    fun append(item: T)
    fun prepend(item: T)
    fun get(index: Int): T?
}