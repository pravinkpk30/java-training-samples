package com.core.java.samples.exceptions;

public class ExceptionPropagationExample {
    public static void main(String[] args) {
        try {
            method1();  // Calling method1
        } catch (ArithmeticException e) {
            System.out.println("Caught in main: " + e);
        }
    }

    static void method1() {
        method2();  // Calling method2
    }

    static void method2() {
        method3();  // Calling method3
    }

    static void method3() {
        // This line will cause an ArithmeticException (division by zero)
        int result = 10 / 0;
    }
}

