package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger: The addAndGet method is atomic, ensuring thread safety by preventing race conditions.
 * No shared mutable state: The sum variable is safely updated by multiple threads without issues.
 *
 * */
public class SafeParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        AtomicInteger sum = new AtomicInteger(0); // Thread-safe mutable variable

        numbers.parallelStream().forEach(n -> sum.addAndGet(n)); // Safe, no race condition

        System.out.println("Sum (thread-safe): " + sum);
    }
}

