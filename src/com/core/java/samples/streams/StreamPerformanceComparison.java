package com.core.java.samples.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamPerformanceComparison {
    public static void main(String[] args) {
        // Create a large list of numbers (1 to 1 million)
        List<Integer> numbers = IntStream.rangeClosed(1, 1_000_000).boxed().collect(Collectors.toList());

        // Sequential stream
        long startTime = System.currentTimeMillis();
        int sequentialSum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
        long sequentialTime = System.currentTimeMillis() - startTime;

        System.out.println("Sequential sum: " + sequentialSum + ", Time taken: " + sequentialTime + " ms");

        // Parallel stream
        startTime = System.currentTimeMillis();
        int parallelSum = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * n)
                .sum();
        long parallelTime = System.currentTimeMillis() - startTime;

        System.out.println("Parallel sum: " + parallelSum + ", Time taken: " + parallelTime + " ms");
    }
}

