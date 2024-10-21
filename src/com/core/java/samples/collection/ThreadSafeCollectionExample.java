package com.core.java.samples.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ThreadSafeCollectionExample {
    public static void main(String[] args) throws InterruptedException {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Add some key-value pairs
        map.put("Java", 10);
        map.put("Javascript", 20);

        // Accessing the map in one thread
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1: Java count: " + map.get("Java"));
        });

//        Thread.sleep(1000);

        // Modifying the map in another thread
        Thread thread2 = new Thread(() -> {
            map.put("Java", 15);  // Concurrent modification
            System.out.println("Thread 2: Updated Java count to 15.");
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final state of the map
        System.out.println("Final Java count: " + map.get("Java"));
    }
}
