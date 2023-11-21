package org.oenegm;

public class QueueLinked<T> implements Queue<T> {
    private int length;
    private QueueNode<T> head;
    private QueueNode<T> tail;

    public QueueLinked() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public final void enqueue(T value) {
        QueueNode<T> node = new QueueNode<>();
        node.value = value;

        if (this.length == 0) {
            this.head = node;
            this.tail = node;
            this.length++;
            return;
        }

        this.tail.next = node;
        this.tail = node;
        this.length++;
    }

    @Override
    public T deque() {
        if (this.length == 0) {
            return null;
        }
        final QueueNode<T> h = this.head;
        this.head = this.head.next;

        this.length--;
        if (this.length == 0) {
            this.tail = null;
        }

        return h.value;
    }

    @Override
    public T peek() {
        if (this.head == null) {
            return null;
        }
        return this.head.value;
    }

    @Override
    public int length() {
        return length;
    }

    private static class QueueNode<K> {
        K value;
        QueueNode<K> next;
    }
}
