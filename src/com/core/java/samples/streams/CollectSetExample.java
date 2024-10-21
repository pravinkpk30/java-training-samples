package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectSetExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "matthew", "Chris");

        // Collect names into a Set
        Set<String> result = names.stream()
                .collect(Collectors.toSet());

        System.out.println(result); // Output: [Alice, Bob]
    }
}

