package org.oenegm.stack

interface Stack<T> {
    fun push(item: T)
    fun pop(): T?
    fun peek(): T?
    fun getLength(): Int
}