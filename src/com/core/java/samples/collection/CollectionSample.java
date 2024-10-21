package com.core.java.samples.collection;

import com.core.java.samples.Employee;

import java.util.*;

public class CollectionSample {
    public static void main(String[] args) {

        System.out.println("***** List type collection *****");
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("SpringBoot");

        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("***** Set type collection *****");
        Set<String> set = new HashSet<>();
        set.add("Javascript");
        set.add("React");
        set.add("Typescript");

        for (String fruit : set) {
            System.out.println(fruit);
        }

        System.out.println("***** Map type collection *****");
        Map<String,Integer> map = new HashMap<>();
        map.put("Java", 10);
        map.put("HTML", 20);

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("***** Without Generic type collection *****");
        List ls = new ArrayList<>();
        ls.add("Java");
        ls.add(232);
        ls.add(12.34);
        ls.add(new Employee("Praveen", 1011, "Demo@1234"));

        for (Object fruit : ls) {
            System.out.println(fruit);
        }

    }
}
