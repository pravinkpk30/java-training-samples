package com.core.java.samples.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class NonThreadSafeCollectionExample {
    public static void main(String[] args) throws InterruptedException {
        // Create an ArrayList (Non-thread-safe)
        ArrayList<Integer> list = new ArrayList<>();

        // how to fix thread safe collection
//        List<Integer> list = Collections.synchronizedList(new ArrayList<>());

        // Add some elements to the list
        list.add(1);
        list.add(2);

        // One thread will add elements
        Thread thread1 = new Thread(() -> {
            for (int i = 3; i <= 5; i++) {
                System.out.println("Thread 1: Adding " + i);
//                synchronized (list) {
//                    list.add(i);
//                }
                list.add(i);
            }
        });

        // Another thread will iterate over the list
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Thread 2: Reading " + list.get(i));
            }
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

        // Print the final state of the list
        System.out.println("Final list: " + list);
    }
}
