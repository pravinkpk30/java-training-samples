package com.core.java.samples.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericsExample {
    public static void main(String[] args) {
        // Generic List
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
//        stringList.add(123); // Error while adding int value in string type

        for (String str : stringList) {
            System.out.println(str); // No casting needed
        }

        // Generic Set
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);

        for (Integer num : integerSet) {
            System.out.println(num); // No casting needed
        }

        // Generic Map
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); // No casting needed
        }
    }
}

