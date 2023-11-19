package org.oenegm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.oenegm.Main.twoCrystalBalls;

class MainTest {

    @Test
    void testTwoCrystalBalls() {

        boolean[] arr = {false, false, false, false, false, false, false, false ,false, false, false, true, true, true, true};

        assertEquals(11, twoCrystalBalls(arr));
    }
}