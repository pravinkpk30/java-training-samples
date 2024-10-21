package com.core.java.samples.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultiCatchBlockExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // May throw ArrayIndexOutOfBoundsException

            int value = 1/0; // May throw ArithmeticException: / by zero

            String text = null;
            System.out.println(text.length());  // May throw NullPointerException

            BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
            int result = Integer.parseInt("invalidNumber");  // Throws NumberFormatException

        } /*catch (ArrayIndexOutOfBoundsException | NullPointerException | FileNotFoundException | NumberFormatException e) {
            System.out.println("An exception occurred: " + e);
        }*/
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e);
        }
        catch (NullPointerException e) {
            System.out.println("An NullPointerException occurred: " + e);
        }
        catch (FileNotFoundException e) {
            System.out.println("An FileNotFoundException occurred: " + e);
        }
        catch (NumberFormatException e) {
            System.out.println("An exception occurred: " + e);
        }
        catch (Exception e) {
            System.out.println("An Root Exception occurred: " + e);
        }
    }
}
