package org.oenegm

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StackLinkedTest {
    @Test
    fun testPushPop() {
        val stack: Stack<Int> = StackLinked()

        stack.push(1)
        stack.push(2)
        stack.push(3)

        Assertions.assertEquals(3, stack.length())
        Assertions.assertEquals(3, stack.pop())
        Assertions.assertEquals(2, stack.pop())
        Assertions.assertEquals(1, stack.length())

        stack.push(4)
        stack.push(5)

        Assertions.assertEquals(5, stack.peek())
        Assertions.assertEquals(5, stack.pop())
        Assertions.assertEquals(4, stack.pop())
        Assertions.assertEquals(1, stack.pop())
        Assertions.assertEquals(0, stack.length())

        Assertions.assertNull(stack.peek())
        Assertions.assertNull(stack.pop())
    }

    @Test
    fun testEmptyStack() {
        val stack = StackLinked<String>()

        Assertions.assertEquals(0, stack.length())

        Assertions.assertNull(stack.peek())
        Assertions.assertNull(stack.pop())
    }
}