package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Synchronized method: addToSum ensures that only one thread can modify the sum variable at a time.
 * */
public class SynchronizedParallelStreamExample {
    private static int sum = 0; // Shared mutable state

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.parallelStream().forEach(n -> addToSum(n));

        System.out.println("Sum (using synchronized): " + sum);
    }

    private static synchronized void addToSum(int n) {
        sum += n;
    }
}
