package org.oenegm.list

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test


class DoublyLinkedListTest {

    private lateinit var list: List<String>

    @Before
    fun setUp() {
        list = DoublyLinkedList()
    }

    @Test
    fun testEmptyList() {
        assertEquals(0, list.getLength())
        assertNull(list.get(0))
        assertNull(list.removeAt(0))
        assertNull(list.remove("A"))
    }

    @Test
    fun testAppendAndGet() {
        list.append("A")
        list.append("B")
        list.append("C")

        assertEquals(3, list.getLength())

        assertEquals("A", list.get(0))
        assertEquals("B", list.get(1))
        assertEquals("C", list.get(2))
    }

    @Test
    fun testPrependAndRemove() {
        list.prepend("A")
        list.prepend("B")
        list.prepend("C")

        assertEquals(3, list.getLength())

        assertEquals("C", list.get(0))
        assertEquals("B", list.get(1))
        assertEquals("A", list.get(2))

        assertEquals("B", list.removeAt(1))

        assertEquals(2, list.getLength())

        assertEquals("C", list.get(0))
        assertEquals("A", list.get(1))
    }

    @Test
    fun testInsertAtAndRemoveItem() {
        list.append("A")
        list.append("C")

        list.insertAt("B", 1)

        assertEquals(3, list.getLength())

        assertEquals("A", list.get(0))
        assertEquals("B", list.get(1))
        assertEquals("C", list.get(2))

        assertEquals("B", list.remove("B"))

        assertEquals(2, list.getLength())

        assertEquals("A", list.get(0))
        assertEquals("C", list.get(1))
    }

    @Test
    fun testRemoveNonexistentItem() {
        list.append("A")
        list.append("B")
        list.append("C")

        assertNull(list.remove("D"))

        assertEquals(3, list.getLength())

        assertEquals("A", list.get(0))
        assertEquals("B", list.get(1))
        assertEquals("C", list.get(2))
    }

    @Test
    fun testRemoveLastItem() {
        list.append("A")
        assertEquals("A", list.removeAt(0))
        assertEquals(0, list.getLength())
        assertNull(list.get(0))
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