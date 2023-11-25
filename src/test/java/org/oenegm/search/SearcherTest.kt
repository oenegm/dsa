package org.oenegm.search

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.oenegm.search.Searcher.binarySearchLoop
import org.oenegm.search.Searcher.binarySearchRecursion
import org.oenegm.search.Searcher.linearSearch

class SearcherTest {

    @Test
    fun testLinearSearchExists() {
        val testArr = arrayOf(
            1, 2, 3, 3, 243, 2131, 3123, 213, 20, 23123, 213543, 645, 7567, 67568, 6535, 2345234
        )
        assertTrue(linearSearch(testArr, 20))
    }

    @Test
    fun testLinearSearchDoesNotExist() {
        val testArr = arrayOf(
            1, 2, 3, 3, 243, 2131, 3123, 213, 20, 23123, 213543, 645, 7567, 67568, 6535, 2345234
        )
        assertFalse(linearSearch(testArr, 50))
    }

    @Test
    fun testBinarySearchLoopExists() {
        val testArr = arrayOf(
            1, 2, 3, 3, 20, 243, 2131, 3123, 23123, 213543
        )
        assertTrue(binarySearchLoop(testArr, 20))
    }

    @Test
    fun testBinarySearchLoopDoesNotExist() {
        val testArr = arrayOf(
            1, 2, 3, 3, 20, 243, 2131, 3123, 23123, 213543
        )
        assertFalse(binarySearchLoop(testArr, 50))
    }

    @Test
    fun testBinarySearchRecursionExists() {
        val testArr = arrayOf(
            1, 2, 3, 3, 20, 243, 2131, 3123, 23123, 213543
        )
        assertTrue(binarySearchRecursion(testArr, 20))
    }

    @Test
    fun testBinarySearchRecursionDoesNotExist() {
        val testArr = arrayOf(
            1, 2, 3, 3, 20, 243, 2131, 3123, 23123, 213543
        )
        assertFalse(binarySearchRecursion(testArr, 50))
    }
}