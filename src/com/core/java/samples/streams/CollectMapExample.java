package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectMapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Collect names into a Map where the key is the name and the value is the length of the name
        Map<String, Integer> result = names.stream()
                .collect(Collectors.toMap(name -> name, name -> name.length()));

        System.out.println(result); // Output: {Alice=5, Bob=3, Charlie=7}
    }
}

