package com.core.java.samples.exceptions;

import com.core.java.samples.exceptions.InvalidAgeException;

// Step 2: Use the Custom Exception
public class UserRegistration {
    public void registerUser(String name, int age) throws InvalidAgeException {
        // Check age and throw the custom exception if invalid
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older. Provided age: " + age);
        }
        // Continue with registration process
        System.out.println("User registered successfully: " + name);
    }
}
