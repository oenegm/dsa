package org.oenegm.sort

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.oenegm.sort.Sorter.bubbleSort
import org.oenegm.sort.Sorter.quickSort

class SorterTest{

    @Test
    fun testBubbleSort() {
        val arr = intArrayOf(23, 414, 4325, 123, 534, 1314, 532, 2423, 131, 67, 567, 456, 36745)
        val expected = intArrayOf(23, 67, 123, 131, 414, 456, 532, 534, 567, 1314, 2423, 4325, 36745)
        bubbleSort(arr)
        assertArrayEquals(expected, arr)
    }

    @Test
    fun testQuickSort() {
        val arr = intArrayOf(23, 414, 4325, 123, 534, 1314, 532, 2423, 131, 67, 567, 456, 36745)
        val expected = intArrayOf(23, 67, 123, 131, 414, 456, 532, 534, 567, 1314, 2423, 4325, 36745)
        quickSort(arr)
        assertArrayEquals(expected, arr)
    }
}