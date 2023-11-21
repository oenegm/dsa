package org.oenegm

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class QueueLinkedTest {
    @Test
    fun testEnqueueDequeue() {
        val queue: Queue<Int> = QueueLinked()

        queue.enqueue(1)
        queue.enqueue(2)
        queue.enqueue(3)

        Assertions.assertEquals(3, queue.length())
        Assertions.assertEquals(1, queue.deque())
        Assertions.assertEquals(2, queue.deque())
        Assertions.assertEquals(1, queue.length())

        queue.enqueue(4)
        queue.enqueue(5)

        Assertions.assertEquals(3, queue.peek())
        Assertions.assertEquals(3, queue.deque())
        Assertions.assertEquals(4, queue.deque())
        Assertions.assertEquals(5, queue.deque())
        Assertions.assertEquals(0, queue.length())

        Assertions.assertNull(queue.peek())
        Assertions.assertNull(queue.deque())
    }

    @Test
    fun testEmptyQueue() {
        val queue = QueueLinked<String>()

        Assertions.assertEquals(0, queue.length())

        Assertions.assertNull(queue.peek())
        Assertions.assertNull(queue.deque())
    }
}