package org.oenegm.stack

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull

import org.junit.Test


class StackLinkedTest {

    @Test
    fun testPushPop() {
        val stack: Stack<Int> = StackLinked()

        stack.push(1)
        stack.push(2)
        stack.push(3)

        assertEquals(3, stack.getLength())
        assertEquals(3, stack.pop())
        assertEquals(2, stack.pop())
        assertEquals(1, stack.getLength())

        stack.push(4)
        stack.push(5)

        assertEquals(5, stack.peek())
        assertEquals(5, stack.pop())
        assertEquals(4, stack.pop())
        assertEquals(1, stack.pop())
        assertEquals(0, stack.getLength())

        assertNull(stack.peek())
        assertNull(stack.pop())
    }

    @Test
    fun testEmptyStack() {
        val stack = StackLinked<String>()

        assertEquals(0, stack.getLength())

        assertNull(stack.peek())
        assertNull(stack.pop())
    }
}