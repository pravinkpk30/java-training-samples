package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;

/**
 * These operations can be combined in a stream pipeline to perform multiple transformations and filtering in a single process.
 *
 * filter(n -> n % 2 == 0): Filters out only even numbers.
 * map(n -> n * n): Squares the filtered even numbers.
 * reduce(0, Integer::sum): Sums the squared numbers.
 *
 *
 * **/
public class StreamPipelineExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers, square them, and then sum them
        int result = numbers.stream()
                .filter(n -> n % 2 == 0)       // Filter even numbers
                .map(n -> n * n)               // Square the numbers
                .reduce(0, Integer::sum);       // Sum the squares

        System.out.println(result); // Output: 220 (2^2 + 4^2 + 6^2 + 8^2 + 10^2)
    }
}

