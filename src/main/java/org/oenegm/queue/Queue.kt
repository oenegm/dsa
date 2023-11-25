package org.oenegm.queue

interface Queue<T> {
    fun enqueue(item: T)
    fun deque(): T?
    fun peek(): T?
    fun getLength(): Int
}