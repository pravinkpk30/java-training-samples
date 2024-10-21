package com.core.java.samples.exceptions;

// Step 1: Define the Custom Exception
public class InvalidAgeException extends Exception {
    // Constructor that accepts a message
    public InvalidAgeException(String message) {
        super(message);
    }
}
