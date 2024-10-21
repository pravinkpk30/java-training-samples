package com.core.java.samples.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("/Users/praveenkumar/Desktop/Studies/SampleJavaProject/src/com/core/java/samples/sample.txt")) {  // Automatically closes the stream using try-with-resources
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);  // Reading character by character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

