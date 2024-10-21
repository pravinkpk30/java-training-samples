package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectJoiningExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Join names with a comma separator
        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println(result); // Output: Alice, Bob, Charlie
    }
}
