package org.oenegm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class QueueLinkedTest {
    @Test
    void testEnqueueDequeue() {
        Queue<Integer> queue = new QueueLinked<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(3, queue.length());

        assertEquals(Integer.valueOf(1), queue.deque());
        assertEquals(Integer.valueOf(2), queue.deque());

        assertEquals(1, queue.length());

        queue.enqueue(4);
        queue.enqueue(5);

        assertEquals(Integer.valueOf(3), queue.peek());

        assertEquals(Integer.valueOf(3), queue.deque());
        assertEquals(Integer.valueOf(4), queue.deque());
        assertEquals(Integer.valueOf(5), queue.deque());

        assertEquals(0, queue.length());
        assertNull(queue.peek());
        assertNull(queue.deque());
    }

    @Test
    void testEmptyQueue() {
        QueueLinked<String> queue = new QueueLinked<>();

        assertEquals(0, queue.length());

        assertNull(queue.peek());
        assertNull(queue.deque());
    }
}