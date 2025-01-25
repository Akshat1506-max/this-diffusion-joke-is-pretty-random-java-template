package org.example;

<<<<<<< HEAD
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
=======
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
>>>>>>> 4157b028725038716108c8d1988fad66bc7ba790
}