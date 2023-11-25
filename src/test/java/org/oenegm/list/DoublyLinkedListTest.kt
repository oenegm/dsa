package org.oenegm.list

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test


class DoublyLinkedListTest {

    private lateinit var doublyLinkedList: DoublyLinkedList<String>

    @Before
    fun setUp() {
        doublyLinkedList = DoublyLinkedList()
    }

    @Test
    fun testEmptyList() {
        assertEquals(0, doublyLinkedList.getLength())
        assertNull(doublyLinkedList.get(0))
        assertNull(doublyLinkedList.removeAt(0))
        assertNull(doublyLinkedList.remove("A"))
    }

    @Test
    fun testAppendAndGet() {
        doublyLinkedList.append("A")
        doublyLinkedList.append("B")
        doublyLinkedList.append("C")

        assertEquals(3, doublyLinkedList.getLength())

        assertEquals("A", doublyLinkedList.get(0))
        assertEquals("B", doublyLinkedList.get(1))
        assertEquals("C", doublyLinkedList.get(2))
    }

    @Test
    fun testPrependAndRemove() {
        doublyLinkedList.prepend("A")
        doublyLinkedList.prepend("B")
        doublyLinkedList.prepend("C")

        assertEquals(3, doublyLinkedList.getLength())

        assertEquals("C", doublyLinkedList.get(0))
        assertEquals("B", doublyLinkedList.get(1))
        assertEquals("A", doublyLinkedList.get(2))

        assertEquals("B", doublyLinkedList.removeAt(1))

        assertEquals(2, doublyLinkedList.getLength())

        assertEquals("C", doublyLinkedList.get(0))
        assertEquals("A", doublyLinkedList.get(1))
    }

    @Test
    fun testInsertAtAndRemoveItem() {
        doublyLinkedList.append("A")
        doublyLinkedList.append("C")

        doublyLinkedList.insertAt("B", 1)

        assertEquals(3, doublyLinkedList.getLength())

        assertEquals("A", doublyLinkedList.get(0))
        assertEquals("B", doublyLinkedList.get(1))
        assertEquals("C", doublyLinkedList.get(2))

        assertEquals("B", doublyLinkedList.remove("B"))

        assertEquals(2, doublyLinkedList.getLength())

        assertEquals("A", doublyLinkedList.get(0))
        assertEquals("C", doublyLinkedList.get(1))
    }

    @Test
    fun testRemoveNonexistentItem() {
        doublyLinkedList.append("A")
        doublyLinkedList.append("B")
        doublyLinkedList.append("C")

        assertNull(doublyLinkedList.remove("D"))

        assertEquals(3, doublyLinkedList.getLength())

        assertEquals("A", doublyLinkedList.get(0))
        assertEquals("B", doublyLinkedList.get(1))
        assertEquals("C", doublyLinkedList.get(2))
    }

    @Test
    fun testRemoveLastItem() {
        doublyLinkedList.append("A")
        assertEquals("A", doublyLinkedList.removeAt(0))
        assertEquals(0, doublyLinkedList.getLength())
        assertNull(doublyLinkedList.get(0))
    }

//    @Test
//    fun testInsertAtInvalidIndex() {
//        doublyLinkedList.append("A")
//        val index = 2
//
//        val exception = assertThrows<IndexOutOfBoundsException> {
//            doublyLinkedList.insertAt("B", index)
//        }
//
//        assertEquals("Index $index out of bounds", exception.message)
//    }
}