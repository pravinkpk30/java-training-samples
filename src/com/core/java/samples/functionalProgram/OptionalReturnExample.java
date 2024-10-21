package com.core.java.samples.functionalProgram;

import java.util.Optional;

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email); // Return an Optional
    }
}

public class OptionalReturnExample {
    public static void main(String[] args) {
        User userWithEmail = new User("Alice", "alice@example.com");
        User userWithoutEmail = new User("Bob", null);

        // Using Optional to safely access email
        Optional<String> emailOptional = userWithEmail.getEmail();
        emailOptional.ifPresent(email -> System.out.println("Email: " + email)); // Output: Email: alice@example.com

        // Handle absence of email
        emailOptional = userWithoutEmail.getEmail();
        System.out.println("Email: " + emailOptional.orElse("No email provided")); // Output: Email: No email provided
    }
}
