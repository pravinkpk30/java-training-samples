package com.core.java.samples.collection;

import java.util.*;

public class CollectionBenefitsExample {
    public static void main(String[] args) {
        // Example of type-safe collection using Generics
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        // Unified architecture: Changing from ArrayList to LinkedList without changing code
        List<String> anotherList = new LinkedList<>();
        anotherList.addAll(list);

        // Reusable algorithms: Sorting the list
        Collections.sort(anotherList);

        // Type-safe and easy iteration
        for (String language : anotherList) {
            System.out.println(language);
        }

        // Using Set to avoid duplicates
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);  // Duplicate, will not be added

        System.out.println("Set: " + set);
    }
}
