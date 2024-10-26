package com.core.java.samples.qa;

/****
 *
 *
 * 9. Collections: Using a LinkedHashMap to Track Drug Order History
 * Question:
 * Implement a system to track the history of drug orders in the order they were placed, ensuring that
 * orders are printed in the order of their insertion. Use a LinkedHashMap to store the order history, where
 * the key is the order ID and the value is the drug name.
 *
 *
 */

import java.util.LinkedHashMap;
import java.util.Map;

class DrugOrderHistory {

    // LinkedHashMap to store order history with order ID and drug name
    private LinkedHashMap<String, String> orderHistory;

    // Constructor to initialize the LinkedHashMap
    public DrugOrderHistory() {
        orderHistory = new LinkedHashMap<>();
    }

    // Method to add an order to the history
    public void addOrder(String orderId, String drugName) {
        orderHistory.put(orderId, drugName);
        System.out.println("Order added: ID = " + orderId + ", Drug = " + drugName);
    }

    // Method to print the order history
    public void printOrderHistory() {
        System.out.println("\nOrder History:");
        for (Map.Entry<String, String> entry : orderHistory.entrySet()) {
            System.out.println("Order ID: " + entry.getKey() + ", Drug Name: " + entry.getValue());
        }
    }
}

public class Question9 {
    public static void main(String[] args) {
        // Create a DrugOrderHistory object
        DrugOrderHistory orderHistory = new DrugOrderHistory();

        // Adding some orders
        orderHistory.addOrder("ORD001", "Aspirin");
        orderHistory.addOrder("ORD002", "Penicillin");
        orderHistory.addOrder("ORD003", "Ibuprofen");
        orderHistory.addOrder("ORD004", "Paracetamol");

        // Print the order history
        orderHistory.printOrderHistory();
    }
}
