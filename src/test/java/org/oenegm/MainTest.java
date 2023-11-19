package org.oenegm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.oenegm.Main.linearSearch;

class MainTest {

    @Test
    void testExists() {

        int[] testArr = new int[]{
                1, 2, 3, 3, 243, 2131, 3123, 213, 20, 23123, 213543, 645, 7567, 67568, 6535, 2345234
        };

        assertTrue(linearSearch(testArr, 20));
    }

    @Test
    void testDoesNotExist() {
        int[] testArr = new int[]{
                1, 2, 3, 3, 243, 2131, 3123, 213, 20, 23123, 213543, 645, 7567, 67568, 6535, 2345234
        };

        assertFalse(linearSearch(testArr, 50));
    }
}