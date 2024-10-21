package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*

How the above example Works:

        numbers.stream() creates a stream from the numbers list.
        .filter(n -> n % 2 == 0) filters out only the even numbers.
        .map(n -> n * n) squares each of the filtered even numbers.
        .collect(Collectors.toList()) collects the results into a new list.
        The result, a list of squared even numbers, is printed.

        */
public class StreamExample {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Example: Find even numbers, square them, and collect into a new list
        List<Integer> squaredEvenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)             // Filter even numbers
                .map(n -> n * n)                     // Square each number
                .collect(Collectors.toList());       // Collect result into a list

        System.out.println("Squared even numbers: " + squaredEvenNumbers);
    }
}


