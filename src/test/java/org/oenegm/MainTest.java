package org.oenegm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.oenegm.Main.binarySearchLoop;
import static org.oenegm.Main.binarySearchRecursion;

class MainTest {

    @Test
    void testExistsLoop() {

        int[] testArr = new int[]{
                1, 2, 3, 3, 20, 243, 2131, 3123, 23123, 213543
        };

        assertTrue(binarySearchLoop(testArr, 20));
    }

    @Test
    void testDoesNotExistLoop() {
        int[] testArr = new int[]{
                1, 2, 3, 3, 20, 243, 2131, 3123, 23123, 213543
        };

        assertFalse(binarySearchLoop(testArr, 50));
    }

    @Test
    void testExistsRecursion() {

        int[] testArr = new int[]{
                1, 2, 3, 3, 20, 243, 2131, 3123, 23123, 213543
        };

        assertTrue(binarySearchRecursion(testArr, 20));
    }

    @Test
    void testDoesNotExistRecursion() {
        int[] testArr = new int[]{
                1, 2, 3, 3, 20, 243, 2131, 3123, 23123, 213543
        };

        assertFalse(binarySearchRecursion(testArr, 50));
    }
}