package com.core.java.samples.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
//        try (FileOutputStream fos = new FileOutputStream("output.dat")) {
//            fos.write(65);  // Writes 'A' in ASCII
//            fos.write(66);  // Writes 'B' in ASCII
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        String sourceImagePath = "/Users/praveenkumar/Desktop/Studies/SampleJavaProject/src/com/core/java/samples/puppy.avif";  // Path to the source image
        String destinationImagePath = "destination-image.avif";  // Path to save the new image
//        String destinationImagePath = "destination-image.jpg";

        try (FileInputStream fis = new FileInputStream(sourceImagePath);
             FileOutputStream fos = new FileOutputStream(destinationImagePath)) {

            byte[] buffer = new byte[1024];  // Create a buffer to hold file data
            int bytesRead;

            // Read bytes from the source image and write them to the destination image
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);  // Write bytes to the destination file
            }

            System.out.println("Image written successfully to " + destinationImagePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
