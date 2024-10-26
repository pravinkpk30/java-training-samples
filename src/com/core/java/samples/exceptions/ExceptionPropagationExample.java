package com.core.java.samples.exceptions;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try {
            method1();  // Calling method1
        } catch (Exception e) {
            System.out.println("Caught in main: " + e);
        }
    }

    static void method1() throws InvalidAgeException {
        method2();  // Calling method2
    }

    static void method2() throws InvalidAgeException {
        method3();  // Calling method3
    }

    static void method3() throws InvalidAgeException {
        try {
            int result = 10 / 0;
        } catch(ArithmeticException e) {
//            System.out.println("Caught in method3 : " + e);
            throw new InvalidAgeException("TEst exception user defined");
        }
        // This line will cause an ArithmeticException (division by zero)

    }
}

