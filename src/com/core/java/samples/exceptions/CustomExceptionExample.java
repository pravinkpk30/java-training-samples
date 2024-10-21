package com.core.java.samples.exceptions;

// Step 3: Handle the Custom Exception
public class CustomExceptionExample {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        try {
            registration.registerUser("Alice", 17); // This will throw the exception
        } catch (InvalidAgeException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
    }
}

