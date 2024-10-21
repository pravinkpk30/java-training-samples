package com.core.java.samples.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Buffered I/O is more efficient.\n");
            bw.write("Each write is buffered for better performance.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
