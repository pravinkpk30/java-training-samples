package com.core.java.samples.collection;

import java.util.*;

public class CollectionIterationExample {

    public static void main(String[] args) {

        // 1. Using Enhanced for-each Loop
        System.out.println("Started Using Enhanced for-each Loop ");
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Golang");

        for (String fruit : list) {
            System.out.println(fruit);
        }

        Set<String> set = new HashSet<>();
        set.add("Javascript");
        set.add("C++");
        set.add("Typescript");

        for (String fruit : set) {
            System.out.println(fruit);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("React", 10);
        map.put("Svelte", 20);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Done Using Enhanced for-each Loop ");

        System.out.println("Started Using Iterator Interface ");

        // 2. Using Iterator Interface
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        Iterator<String> iterator1 = list1.iterator();
        while (iterator1.hasNext()) {
            String fruit = iterator1.next();
            System.out.println(fruit);
        }

        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");

        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Apple", 10);
        map1.put("Banana", 20);

        Iterator<Map.Entry<String, Integer>> iterator3 = map.entrySet().iterator();
        while (iterator3.hasNext()) {
            Map.Entry<String, Integer> entry = iterator3.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Done Using Iterator Interface ");

        System.out.println("Started Using forEach() Method (Lambda Expressions) ");

        // 3. Using forEach() Method (Lambda Expressions)
        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Orange");

        list2.forEach(fruit -> System.out.println(fruit));

        Set<String> set2 = new HashSet<>();
        set2.add("Apple");
        set2.add("Banana");
        set2.add("Orange");

        set2.forEach(fruit -> System.out.println(fruit));

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Apple", 10);
        map2.put("Banana", 20);

        map2.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("Done Using forEach() Method (Lambda Expressions) ");

        System.out.println("Started Using ListIterator (for List Only) ");

        // 4. Using ListIterator (for List Only)
        List<String> list3 = new ArrayList<>();
        list3.add("Apple");
        list3.add("Banana");
        list3.add("Orange");

        ListIterator<String> listIterator = list3.listIterator();
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);
        }

        System.out.println("Done Using ListIterator (for List Only) ");

        System.out.println("Started Using Streams (Java 8+) ");

        // 5. Using Streams (Java 8+)
        List<String> list4 = new ArrayList<>();
        list4.add("Apple");
        list4.add("Banana");
        list4.add("Orange");

        list4.stream().forEach(fruit -> System.out.println(fruit));

        Set<String> set4 = new HashSet<>();
        set4.add("Apple");
        set4.add("Banana");
        set4.add("Orange");

        set4.stream().forEach(System.out::println);  // Using method reference

        Map<String, Integer> map4 = new HashMap<>();
        map4.put("Apple", 10);
        map4.put("Banana", 20);

        map4.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("Done Using Streams (Java 8+) ");

        System.out.println("Started Using Traditional for Loop (for Indexed Collections like List) ");

        // 6. Using Traditional for Loop (for Indexed Collections like List)
        List<String> list5 = new ArrayList<>();
        list5.add("Apple");
        list5.add("Banana");
        list5.add("Orange");

        for (int i = 0; i < list5.size(); i++) {
            System.out.println(list5.get(i));
        }

        System.out.println("Done Using Traditional for Loop (for Indexed Collections like List) ");
    }

}
