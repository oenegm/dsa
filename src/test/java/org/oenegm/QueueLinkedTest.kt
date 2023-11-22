package org.oenegm

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Test

internal class QueueLinkedTest {
    @Test
    fun testEnqueueDequeue() {
        val queue: Queue<Int> = QueueLinked()

        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)

        assertEquals(3, queue.length())
        assertEquals(1, queue.deque())
        assertEquals(2, queue.deque())
        assertEquals(1, queue.length())

        queue.enqueue(4)
        queue.enqueue(5)

        assertEquals(3, queue.peek())
        assertEquals(3, queue.deque())
        assertEquals(4, queue.deque())
        assertEquals(5, queue.deque())
        assertEquals(0, queue.length())

        assertNull(queue.peek())
        assertNull(queue.deque())
    }

    @Test
    fun testEmptyQueue() {
        val queue = QueueLinked<String>()

        assertEquals(0, queue.length())

        assertNull(queue.peek())
        assertNull(queue.deque())
    }
}