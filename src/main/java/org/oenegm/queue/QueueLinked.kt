package org.oenegm.queue

class QueueLinked<T> : Queue<T> {

    private var length = 0
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    override fun enqueue(item: T) {

        val node: Node<T> = Node(item)

        if (length++ == 0) {
            head = node
            tail = node
            return
        }

        tail!!.next = node
        tail = node
    }

    override fun deque(): T? {

        val h = head
        head = head?.next
        length = 0.coerceAtLeast(length - 1)

        return h?.value
    }

    override fun peek(): T? = head?.value

    override fun getLength(): Int = length

    private class Node<K>(var value: K) {
        var next: Node<K>? = null
    }
}