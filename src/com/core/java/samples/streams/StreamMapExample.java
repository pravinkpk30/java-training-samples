package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
map(String::toUpperCase): Converts each string to uppercase.
Transformation: The input stream of lowercase names is transformed to a stream of uppercase names.
*/
public class StreamMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "matthew", "levis");

        // Convert all names to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseNames); // Output: [ALICE, BOB, CHARLIE]
    }
}
