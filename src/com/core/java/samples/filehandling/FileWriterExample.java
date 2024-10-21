package com.core.java.samples.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("output.txt")) {  // Automatically closes the stream
            writer.write("Hello, World!\n");
            writer.write("File I/O in Java.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

