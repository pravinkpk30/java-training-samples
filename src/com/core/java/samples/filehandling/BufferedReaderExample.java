package com.core.java.samples.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/praveenkumar/Desktop/Studies/SampleJavaProject/src/com/core/java/samples/sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {  // Reads one line at a time
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
