package org.oenegm.sort

object Sorter {

    fun bubbleSort(arr: IntArray) {
        for (i in arr.indices) {
            for (j in 0 until arr.size - 1 - i) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
    }

    fun quickSort(array: IntArray) {
        quickSort(array, 0, array.size - 1)
    }

    private fun quickSort(array: IntArray, low: Int, high: Int) {
        if (low >= high) {
            return
        }
        val pivotIndex = partition(array, low, high)
        quickSort(array, low, pivotIndex - 1)
        quickSort(array, pivotIndex + 1, high)
    }

    private fun partition(array: IntArray, low: Int, high: Int): Int {
        val pivot = array[high]
        var index = low - 1
        for (i in low until high) {
            if (array[i] <= pivot) {
                index++
                val temp = array[i]
                array[i] = array[index]
                array[index] = temp
            }
        }
        index++
        array[high] = array[index]
        array[index] = pivot
        return index
    }
}