package org.oenegm.stack

class StackLinked<T> : Stack<T> {
    private var length = 0
    private var head: StackNode<T>? = null

    override fun push(item: T) {
        val node = StackNode(item)

        if (length++ == 0) {
            head = node
            return
        }

        node.prev = head
        head = node
    }

    override fun pop(): T? {
        val h = head
        head = head?.prev
        length = 0.coerceAtLeast(length - 1)

        return h?.value
    }

    override fun peek(): T? = head?.value

    override fun getLength(): Int = length

    private class StackNode<K>(var value: K) {
        var prev: StackNode<K>? = null
    }
}