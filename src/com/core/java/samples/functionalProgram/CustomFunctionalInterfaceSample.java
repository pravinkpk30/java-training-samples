package com.core.java.samples.functionalProgram;

/**
 *
 * Lambda Expressions:
 * input -> new StringBuilder(input).reverse().toString(): A lambda expression to reverse the input string.
 * input -> input.toUpperCase(): A lambda expression to convert the input string to uppercase.
 * input -> "Prefix_" + input: A lambda expression to concatenate a prefix to the input string.
 *
 * Method Calls: The manipulate method is called on instances of StringManipulator using the defined lambda expressions.
 *
 * **/
public class CustomFunctionalInterfaceSample {
    public static void main(String[] args) {
        // Using a lambda expression to reverse a string
        StringManipulator reverser = input -> new StringBuilder(input).reverse().toString();
        System.out.println("Reversed: " + reverser.manipulate("Hello")); // Output: olleH

        // Using a lambda expression to convert a string to uppercase
        StringManipulator upperCaser = input -> input.toUpperCase();
        System.out.println("Uppercase: " + upperCaser.manipulate("Hello")); // Output: HELLO

        // Using a lambda expression to concatenate a string with a prefix
        StringManipulator prefixer = input -> "Prefix_" + input;
        System.out.println("Prefixed: " + prefixer.manipulate("Hello")); // Output: Prefix_Hello

        // Calling the default method
        reverser.printMessage("This is the custom messages");

        // Calling the static method
        System.out.println(StringManipulator.sendMessage("Welcome to static message"));
    }
}

