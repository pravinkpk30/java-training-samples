package com.core.java.samples.generics;

import java.util.ArrayList;
import java.util.List;
public class GenericBoundedTypeExample {

    public static <T extends Number> void printNumbers(List<T> numbers) {
        for (T number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        doubleList.add(3.3);

        System.out.println("Integer List:");
        printNumbers(integerList); // Works with Numbers

        System.out.println("\nDouble List:");
        printNumbers(doubleList); // Works with Numbers
    }
}
