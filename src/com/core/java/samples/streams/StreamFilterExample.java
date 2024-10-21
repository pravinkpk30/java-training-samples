package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * filter(n -> n % 2 == 0): Retains only the even numbers.
 * Condition: Each element is tested, and only those that pass (even numbers) are included in the resulting stream.
 * **/
public class StreamFilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter out even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers); // Output: [2, 4, 6, 8, 10]
    }
}

