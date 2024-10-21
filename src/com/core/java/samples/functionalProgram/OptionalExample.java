package com.core.java.samples.functionalProgram;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating an Optional
        Optional<String> optionalValue = Optional.of("Hello, Optional!");

        // Check if a value is present
        if (optionalValue.isPresent()) {
            System.out.println("Value: " + optionalValue.get());
        }

        // Using ifPresent
        optionalValue.ifPresent(value -> System.out.println("Value present: " + value));

        // Handling absence of value
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Value or default: " + emptyOptional.orElse("Default Value")); // Output: Default Value

        // Using orElseGet
        String message = emptyOptional.orElseGet(() -> "Value was not present, using Supplier");
        System.out.println(message); // Output: Value was not present, using Supplier

        // Using orElseThrow
        try {
            String value = emptyOptional.orElseThrow(() -> new IllegalArgumentException("No value present"));
        } catch (Exception e) {
            System.out.println(e.getMessage()); // Output: No value present
        }

        // Optional supports several functional-style operations map, flatmap & filter

        // Transforms the value inside the Optional if present.
        Optional<String> upperCaseOptional = optionalValue.map(String::toUpperCase);
        System.out.println(upperCaseOptional.get()); // Output: HELLO, OPTIONAL!

        // Similar to map, but the mapper function must return an Optional.
        Optional<Integer> lengthOptional = optionalValue.flatMap(value -> Optional.of(value.length()));
        System.out.println(lengthOptional.get()); // Output: 18

        // Filters the value if present based on the provided predicate.
        Optional<String> filteredOptional = optionalValue.filter(value -> value.contains("Optional"));
        filteredOptional.ifPresent(value -> System.out.println("Filtered value: " + value)); // Output: Filtered value: Hello, Optional!

    }
}

