package com.core.java.samples.filehandling;

import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterExample {
    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("/Users/praveenkumar/Desktop/Studies/SampleJavaProject/src/com/core/java/samples/Sample.txt")) {
            pw.println("Java I/O with PrintWriter.");
            pw.printf("Formatted number: %d%n", 100);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
