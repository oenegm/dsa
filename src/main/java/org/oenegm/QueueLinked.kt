package org.oenegm

class QueueLinked<T> : Queue<T> {

    private var length = 0
    private var head: QueueNode<T>? = null
    private var tail: QueueNode<T>? = null

    override fun enqueue(value: T) {
        val node = QueueNode(value)

        if (length == 0) {
            head = node
            tail = node
            length++
            return
        }

        tail!!.next = node
        tail = node
        length++
    }

    override fun deque(): T? {
        if (length == 0) {
            return null
        }
        val h = head

        head = head?.next

        length--
        if (length == 0) {
            tail = null
        }

        return h!!.value
    }

    override fun peek(): T? {
        if (head == null) {
            return null
        }

        return head?.value
    }

    override fun length(): Int {
        return length
    }

    private class QueueNode<K>(var value: K) {
        var next: QueueNode<K>? = null
    }
}
