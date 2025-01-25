package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testRandomWalkWithinRange() {
        int N = 10; // Number of steps
        int result = App.simulateRandomWalk(N);

        // Ensure the result is within the range [-N, N]
        assertTrue(result >= -N && result <= N, "Final position should be within -N to N.");
    }

    @Test
    void testRandomWalkMultipleSteps() {
        int N = 100; // Number of steps
        int result = App.simulateRandomWalk(N);

        // Ensure the result is within the range [-N, N]
        assertTrue(result >= -N && result <= N, "Final position should be within -N to N.");
    }
}