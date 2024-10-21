package com.core.java.samples.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionSample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0); // This will throw an exception
            System.out.println(result);
        } catch (ArithmeticException e) {
//            System.out.println("Cannot divide by zero!");
            System.out.println(e);
        } finally {
            System.out.println("Execution completed.");
        }
    }

    public void readFile(String filename) throws IOException {
        // Code that may throw an IOException
        FileReader file = new FileReader(filename);

    }


    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Denominator cannot be zero."); // Throwing an exception
        }
        return a / b;
    }
}
