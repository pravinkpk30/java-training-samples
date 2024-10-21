package com.core.java.samples.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNIOReadsExample {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("/Users/praveenkumar/Desktop/Studies/SampleJavaProject/src/com/core/java/samples/sample.txt"));  // Reads all lines into a List
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
