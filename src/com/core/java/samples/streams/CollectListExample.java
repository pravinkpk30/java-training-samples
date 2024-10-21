package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectListExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Collect names into a List
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(result); // Output: [Alice]
    }
}

