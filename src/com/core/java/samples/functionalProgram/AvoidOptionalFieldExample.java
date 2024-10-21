package com.core.java.samples.functionalProgram;

import java.util.Optional;

class UserWithOptionalField {
    private String name;
    private Optional<String> email; // Avoid this

    public UserWithOptionalField(String name, String email) {
        this.name = name;
        this.email = Optional.ofNullable(email);
//        this.email = Optional.of(email); // Throws NullpointerException while calling user.getEmail() alone in main method
    }

    public Optional<String> getEmail() {
        return email;
    }
}

public class AvoidOptionalFieldExample {
    public static void main(String[] args) {
        UserWithOptionalField user = new UserWithOptionalField("Charlie", null);
        System.out.println("Email: " + user.getEmail().orElse("No email provided")); // Output: No email provided
    }
}

