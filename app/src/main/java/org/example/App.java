package org.example;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        // Define the number of steps (N) and trials (M)
        int[] stepsArray = {10, 50, 100, 500, 1000}; // Values of N
        int M = 10; // Number of trials for each N

        // Simulate random walk for each value of N
        System.out.println("Random Walk Simulation Results:");
        for (int N : stepsArray) {
            System.out.println("Number of Steps (N): " + N);
            for (int trial = 1; trial <= M; trial++) {
                int finalPosition = simulateRandomWalk(N);
                System.out.printf("Trial %d: Final Position (D) = %d%n", trial, finalPosition);
            }
            System.out.println(); // Add space between results for clarity
        }
    }

    /**
     * Simulates a one-dimensional random walk for the given number of steps.
     * @param steps The number of steps the particle takes.
     * @return The final position of the particle after the walk.
     */
    public static int simulateRandomWalk(int steps) {
        Random random = new Random();
        int currentPosition = 0;

        for (int i = 0; i < steps; i++) {
            // Randomly decide whether to move left or right
            if (random.nextBoolean()) {
                currentPosition++; // Move right
            } else {
                currentPosition--; // Move left
            }
        }

        return currentPosition;
    }
}