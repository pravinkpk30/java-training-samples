package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;

/**
 * reduce(0, Integer::sum): Combines all elements by summing them, starting with the initial value of 0.
 * Reduction: The stream is reduced to a single value (the sum of the elements).
 * **/
public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum all numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println(sum); // Output: 15
    }
}

