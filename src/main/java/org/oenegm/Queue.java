package org.oenegm;

public interface Queue<T> {
    void enqueue(T value);

    T deque();

    T peek();

    int length();
}
