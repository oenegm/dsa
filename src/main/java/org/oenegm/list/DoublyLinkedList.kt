package org.oenegm.list

class DoublyLinkedList<T> : List<T> {

    private var length: Int = 0
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    override fun getLength(): Int = length

    override fun insertAt(item: T, index: Int) {

        if (index > length) {
            throw IndexOutOfBoundsException(index)
        }

        if (index == length) {
            append(item)
            return
        }

        if (index == 0) {
            prepend(item)
            return
        }

        val node: Node<T> = Node(item)
        length++

        val curr = getAt(index)

        node.next = curr
        node.prev = curr!!.prev

        curr.prev!!.next = node
        curr.prev = node
    }

    override fun append(item: T) {

        val node: Node<T> = Node(item)

        if (length++ == 0) {
            head = node
            tail = node
            return
        }

        tail!!.next = node
        node.prev = tail
        tail = node
    }

    override fun prepend(item: T) {

        val node: Node<T> = Node(item)

        if (length++ == 0) {
            head = node
            tail = node
            return
        }

        head!!.prev = node
        node.next = head
        head = node
    }

    override fun remove(item: T): T? {

        var curr = head

        var i = 0
        while (i++ < length && curr!!.value != item) {
            curr = curr.next
        }

        return removeNode(curr)
    }

    override fun removeAt(index: Int): T? {

        val node = getAt(index)

        return removeNode(node)
    }

    private fun removeNode(node: Node<T>?): T? {

        if (node == null) {
            return null
        }

        if (--length == 0) {
            head = null
            tail = null
            return node.value
        }

        node.prev?.next = node.next
        node.next?.prev = node.prev

        if (node == head) {
            head = node.next
        }

        if (node == tail) {
            tail = node.prev
        }

        return node.value
    }

    override fun get(index: Int): T? = getAt(index)?.value

    private fun getAt(index: Int): Node<T>? {

        var curr = head

        for (i in 0 until index) {
            curr = curr?.next
        }
        return curr
    }

    private class Node<K>(var value: K) {
        var prev: Node<K>? = null
        var next: Node<K>? = null
    }
}