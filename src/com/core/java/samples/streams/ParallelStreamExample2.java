package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;

// We can also convert a sequential stream to a parallel stream using the parallel() method.
public class ParallelStreamExample2 {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Convert sequential stream to parallel
        int sumOfSquares = numbers.stream()        // Start with a sequential stream
                .parallel()      // Convert to parallel stream
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squares of even numbers (using parallel()): " + sumOfSquares);
    }
}

