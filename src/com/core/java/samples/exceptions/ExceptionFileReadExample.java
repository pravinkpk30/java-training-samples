package com.core.java.samples.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ExceptionFileReadExample {
    public static void main(String[] args) {
        try {
            readFile("Sample1.txt"); // Call the method that can throw an IOException
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            System.out.println("Execution completed."); // This will always execute
        }
    }

    // Method that declares it can throw an IOException
    public static void readFile(String filename) throws IOException {
        BufferedReader reader = null;
        try {
            // Trying to read the file
            reader = new BufferedReader(new FileReader("/Users/praveenkumar/Desktop/Studies/SampleJavaProject/src/com/core/java/samples/"+filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line of the file
            }
        } catch (FileNotFoundException e) {
            // Handle specific exception for file not found
            throw new IOException("File not found: " + filename, e); // Throwing a new IOException
        } finally {
            // Cleanup code to close the BufferedReader
            if (reader != null) {
                try {
                    reader.close(); // Close the reader
                } catch (IOException e) {
                    System.out.println("Error closing the file reader: " + e.getMessage());
                }
            }
        }
    }
}
