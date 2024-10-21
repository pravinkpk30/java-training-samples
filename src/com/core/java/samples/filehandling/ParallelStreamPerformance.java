package com.core.java.samples.filehandling;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamPerformance {
    public static void main(String[] args) {
        // Create a large list of numbers
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            numbers.add(i);
        }

        // Sequential Stream
        long startTime = System.currentTimeMillis();
        long sumSequential = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential sum: " + sumSequential);
        System.out.println("Time taken (sequential): " + (endTime - startTime) + " ms");

        // Parallel Stream
        startTime = System.currentTimeMillis();
        long sumParallel = numbers.parallelStream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        endTime = System.currentTimeMillis();
        System.out.println("Parallel sum: " + sumParallel);
        System.out.println("Time taken (parallel): " + (endTime - startTime) + " ms");
    }
}
