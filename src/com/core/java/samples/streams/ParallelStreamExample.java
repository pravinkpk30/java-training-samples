package com.core.java.samples.streams;

import java.util.Arrays;
import java.util.List;

/*

parallelStream(): Creates a parallel stream from the numbers list. Operations on the stream are performed in parallel across multiple threads.
filter(n -> n % 2 == 0): Filters out only the even numbers.
map(n -> n * n): Squares each of the filtered even numbers.
reduce(0, Integer::sum): Reduces the stream by summing the squares using a starting value of 0.

*/
public class ParallelStreamExample {
    public static void main(String[] args) {
        // List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using parallel stream to calculate the sum of squares of even numbers
        int sumOfSquares = numbers.parallelStream() // Create a parallel stream
                .filter(n -> n % 2 == 0) // Filter even numbers
                .map(n -> n * n)         // Square each number
                .reduce(0, Integer::sum); // Sum the squares

        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}
