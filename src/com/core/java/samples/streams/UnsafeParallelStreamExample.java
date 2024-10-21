package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;

/*
*
* Multiple threads are updating the shared sum variable concurrently, causing unpredictable results.
* Different threads can overwrite each other's updates, leading to incorrect or partial sums.
*
* */
public class UnsafeParallelStreamExample {
    private static int sum = 0; // Shared mutable state

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.parallelStream().forEach(n -> sum += n); // Unsafe

        System.out.println("Sum (unsafe): " + sum);
    }
}

