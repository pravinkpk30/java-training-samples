package com.core.java.samples.generics;

import java.util.List;

public class GenericWildcardExample {
    public static void printList(List<?> list) { // Unbounded wildcard
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void printNumbers(List<? extends Number> numbers) { // Upper bounded wildcard
        for (Number number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        List<String> stringList = List.of("Java","Javascript","React");

        printList(intList);
        printNumbers(doubleList);
//        printNumbers(stringList); // Compile time error
        printList(stringList);
    }
}
