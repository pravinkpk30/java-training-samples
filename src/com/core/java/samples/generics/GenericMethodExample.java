package com.core.java.samples.generics;

import java.util.List;

public class GenericMethodExample {
    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = List.of("Apple", "Banana", "Cherry");
        List<Integer> integerList = List.of(1, 2, 3);

        System.out.println("String List:");
        printList(stringList); // No casting needed

        System.out.println("\nInteger List:");
        printList(integerList); // No casting needed
    }
}

