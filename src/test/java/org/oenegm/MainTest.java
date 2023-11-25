package org.oenegm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.oenegm.Main.bubbleSort;
import static org.oenegm.Main.quickSort;

class MainTest {

    @Test
    void testBubbleSort() {
        int[] arr = {23, 414, 4325, 123, 534, 1314, 532, 2423, 131, 67, 567, 456, 36745};

        int[] expected = {23, 67, 123, 131, 414, 456, 532, 534, 567, 1314, 2423, 4325, 36745};

        bubbleSort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void testQuickSort() {
        int[] arr = {23, 414, 4325, 123, 534, 1314, 532, 2423, 131, 67, 567, 456, 36745};

        int[] expected = {23, 67, 123, 131, 414, 456, 532, 534, 567, 1314, 2423, 4325, 36745};

        quickSort(arr);

        assertArrayEquals(expected, arr);
    }
}