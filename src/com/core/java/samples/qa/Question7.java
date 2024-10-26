package com.core.java.samples.qa;

/*****
 *
 * 7. Collections: Using a HashMap to Track Drug Orders
 * Question:
 * In a pharma supply chain, you need to track drug orders from multiple clients. Each client may place
 * orders for multiple drug types. Implement a HashMap where the key is the client's name and the value is
 * a List of drug names they ordered. Add functionality to:
 * • Add an order for a client.
 * • Print out all orders for a specific client.
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class DrugOrderTracking {

    // HashMap to track orders by clients
    private Map<String, List<String>> clientOrders;

    // Constructor to initialize the HashMap
    public DrugOrderTracking() {
        clientOrders = new HashMap<>();
    }

    // Method to add an order for a client
    public void addOrder(String clientName, String drugName) {
        // If the client already has an order, retrieve the existing list
        List<String> orders = clientOrders.getOrDefault(clientName, new ArrayList<>());
        orders.add(drugName); // Add the new drug to the order list
        clientOrders.put(clientName, orders); // Put it back in the map

        System.out.println("Added drug '" + drugName + "' to client '" + clientName + "' orders.");
    }

    // Method to print all orders for a specific client
    public void printOrdersForClient(String clientName) {
        List<String> orders = clientOrders.get(clientName);

        if (orders != null && !orders.isEmpty()) {
            System.out.println("Orders for client '" + clientName + "':");
            for (String drug : orders) {
                System.out.println("- " + drug);
            }
        } else {
            System.out.println("No orders found for client '" + clientName + "'.");
        }
    }
}

public class Question7 {
    public static void main(String[] args) {
        // Create a DrugOrderTracking object
        DrugOrderTracking orderTracking = new DrugOrderTracking();

        // Add some orders for various clients
        orderTracking.addOrder("Client A", "Aspirin");
        orderTracking.addOrder("Client A", "Penicillin");
        orderTracking.addOrder("Client B", "Ibuprofen");
        orderTracking.addOrder("Client C", "Paracetamol");
        orderTracking.addOrder("Client B", "Amoxicillin");

        // Print orders for specific clients
        System.out.println();
        orderTracking.printOrdersForClient("Client A");
        System.out.println();
        orderTracking.printOrdersForClient("Client B");
        System.out.println();
        orderTracking.printOrdersForClient("Client C");
        System.out.println();
        orderTracking.printOrdersForClient("Client D"); // Client with no orders
    }
}
