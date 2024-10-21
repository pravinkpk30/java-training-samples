package com.core.java.samples.exceptions;

public class MultiCatchWrongOrderExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will throw ArithmeticException
        } /*catch (Exception e) {  // General exception catch block
            System.out.println("Caught Exception: " + e);
        }*/ catch (ArithmeticException e) {  // More specific exception
            // This will cause a compilation error
            System.out.println("Caught ArithmeticException: " + e);
        } catch (Exception e) {  // General exception catch block
            System.out.println("Caught Exception: " + e);
        }
    }
}

