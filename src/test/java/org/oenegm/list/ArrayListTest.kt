package org.oenegm.list

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.assertThrows

class ArrayListTest {

    private lateinit var list: List<String>

    @Before
    fun setUp() {
        list = ArrayList()
    }

    @Test
    fun testEmptyList() {
        Assert.assertEquals(0, list.getLength())
        Assert.assertNull(list.get(0))
        Assert.assertNull(list.removeAt(0))
        Assert.assertNull(list.remove("A"))
    }

    @Test
    fun testAppendAndGet() {
        list.append("A")
        list.append("B")
        list.append("C")

        Assert.assertEquals(3, list.getLength())

        Assert.assertEquals("A", list.get(0))
        Assert.assertEquals("B", list.get(1))
        Assert.assertEquals("C", list.get(2))
    }

    @Test
    fun testPrependAndRemove() {
        list.prepend("A")
        list.prepend("B")
        list.prepend("C")

        Assert.assertEquals(3, list.getLength())

        Assert.assertEquals("C", list.get(0))
        Assert.assertEquals("B", list.get(1))
        Assert.assertEquals("A", list.get(2))

        Assert.assertEquals("B", list.removeAt(1))

        Assert.assertEquals(2, list.getLength())

        Assert.assertEquals("C", list.get(0))
        Assert.assertEquals("A", list.get(1))
    }

    @Test
    fun testInsertAtAndRemoveItem() {
        list.append("A")
        list.append("C")

        list.insertAt("B", 1)

        Assert.assertEquals(3, list.getLength())

        Assert.assertEquals("A", list.get(0))
        Assert.assertEquals("B", list.get(1))
        Assert.assertEquals("C", list.get(2))

        Assert.assertEquals("B", list.remove("B"))

        Assert.assertEquals(2, list.getLength())

        Assert.assertEquals("A", list.get(0))
        Assert.assertEquals("C", list.get(1))
    }

    @Test
    fun testRemoveNonexistentItem() {
        list.append("A")
        list.append("B")
        list.append("C")

        Assert.assertNull(list.remove("D"))

        Assert.assertEquals(3, list.getLength())

        Assert.assertEquals("A", list.get(0))
        Assert.assertEquals("B", list.get(1))
        Assert.assertEquals("C", list.get(2))
    }

    @Test
    fun testRemoveLastItem() {
        list.append("A")
        Assert.assertEquals("A", list.removeAt(0))
        Assert.assertEquals(0, list.getLength())
        Assert.assertNull(list.get(0))
    }

    @Test
    fun testInsertAtInvalidIndex() {
        list.append("A")
        val index = 2

        val exception = assertThrows<IndexOutOfBoundsException> {
            list.insertAt("B", index)
        }

        Assert.assertEquals("Index out of range: $index", exception.message)
    }
}