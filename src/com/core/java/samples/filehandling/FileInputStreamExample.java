package com.core.java.samples.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("/Users/praveenkumar/Desktop/Studies/SampleJavaProject/src/com/core/java/samples/puppy.avif")) {
            int byteContent;
            while ((byteContent = fis.read()) != -1) {
                System.out.print(byteContent + " ");  // Outputs bytes of the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

