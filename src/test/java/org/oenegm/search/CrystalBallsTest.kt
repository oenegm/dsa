package org.oenegm.search

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.oenegm.search.CrystalBalls.twoCrystalBalls

class CrystalBallsTest {
    @Test
    fun testTwoCrystalBalls() {
        val arr = booleanArrayOf(
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            false,
            true,
            true,
            true,
            true
        )
        assertEquals(11, twoCrystalBalls(arr))
    }
}