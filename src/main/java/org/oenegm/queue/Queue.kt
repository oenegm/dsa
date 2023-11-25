package org.oenegm.queue

interface Queue<T> {
    fun enqueue(value: T)
    fun deque(): T?
    fun peek(): T?
    fun length(): Int
}