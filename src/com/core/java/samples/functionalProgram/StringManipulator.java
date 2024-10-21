package com.core.java.samples.functionalProgram;

/**
 * StringManipulator is defined as a functional interface with a single abstract method manipulate(String input).
 *
 * **/
@FunctionalInterface
interface StringManipulator {
    String manipulate(String input);

    // Default method to print a message
    default void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    // Static method to return message
    static String sendMessage(String message) {
        return message;
    }
}

