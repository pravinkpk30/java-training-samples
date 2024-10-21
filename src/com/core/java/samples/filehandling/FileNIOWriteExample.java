package com.core.java.samples.filehandling;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.util.Arrays;

public class FileNIOWriteExample {
    public static void main(String[] args) {
        try {
            Files.write(Paths.get("output.txt"), Arrays.asList("Hello, World!", "This is Java NIO!"),
                    StandardCharsets.UTF_8);  // Writing multiple lines
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
