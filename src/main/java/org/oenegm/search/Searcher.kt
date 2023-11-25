package org.oenegm.search

object Searcher {

    fun linearSearch(arr: Array<Int>, number: Int): Boolean {
        for (i in arr.indices) {
            if (arr[i] == number) {
                return true
            }
        }
        return false
    }

    fun binarySearchLoop(arr: Array<Int>, value: Int): Boolean {
        var low = 0
        var high = arr.size
        do {
            val middle = low + (high - low) / 2
            val current = arr[middle]
            if (current == value) {
                return true
            } else if (current > value) {
                high = middle
            } else {
                low = middle + 1
            }
        } while (low < high)
        return false
    }

    fun binarySearchRecursion(arr: Array<Int>, value: Int): Boolean {
        return binarySearchRecursion(arr, value, 0, arr.size)
    }

    private fun binarySearchRecursion(arr: Array<Int>, value: Int, low: Int, high: Int): Boolean {
        if (low > high) {
            return false
        }
        val middle = low + (high - low) / 2
        val current = arr[middle]
        return if (current == value) {
            true
        } else if (current > value) {
            binarySearchRecursion(arr, value, low, middle - 1)
        } else {
            binarySearchRecursion(arr, value, middle + 1, high)
        }
    }
}