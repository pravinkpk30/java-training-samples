package com.core.java.samples.qa;

import java.util.HashMap;
import java.util.Map;

/****
 *
 * 8. Exception Handling: Handling Inventory Shortage
 * Question:
 * When fulfilling drug orders, you need to check whether there is enough stock in the inventory. If there is
 * a shortage, throw a StockShortageException. Implement code that handles this exception by providing a
 * clear error message.
 *
 */

// Custom exception class for stock shortage
class StockShortageException extends Exception {
    public StockShortageException(String message) {
        super(message);
    }
}

class DrugInventory {
    // A simple inventory map to store drug names and their quantities
    private Map<String, Integer> inventory;

    // Constructor to initialize inventory
    public DrugInventory() {
        inventory = new HashMap<>();
    }

    // Method to add stock to the inventory
    public void addStock(String drugName, int quantity) {
        inventory.put(drugName, inventory.getOrDefault(drugName, 0) + quantity);
        System.out.println(quantity + " units of " + drugName + " added to the inventory.");
    }

    // Method to check stock and fulfill order
    public void fulfillOrder(String drugName, int requestedQuantity) throws StockShortageException {
        int availableStock = inventory.getOrDefault(drugName, 0);

        // Check if there is enough stock
        if (availableStock < requestedQuantity) {
            throw new StockShortageException("Not enough stock for " + drugName + ". Available: " + availableStock + ", Requested: " + requestedQuantity);
        }

        // Reduce stock and fulfill the order
        inventory.put(drugName, availableStock - requestedQuantity);
        System.out.println("Order fulfilled for " + requestedQuantity + " units of " + drugName + ".");
    }
}

public class Question8 {
    public static void main(String[] args) {
        // Create a new drug inventory
        DrugInventory inventory = new DrugInventory();

        // Add stock to the inventory
        inventory.addStock("Aspirin", 100);
        inventory.addStock("Penicillin", 50);

        // Attempt to fulfill orders and handle potential stock shortages
        try {
            inventory.fulfillOrder("Aspirin", 30);  // Should succeed
            inventory.fulfillOrder("Penicillin", 60); // Should throw StockShortageException
        } catch (StockShortageException e) {
            // Handle the exception with a clear error message
            System.out.println("Error: " + e.getMessage());
        }

        // Attempt another order
        try {
            inventory.fulfillOrder("Aspirin", 80); // Should succeed
        } catch (StockShortageException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Check for a drug that doesn't exist in the inventory
        try {
            inventory.fulfillOrder("Ibuprofen", 10); // Should throw StockShortageException
        } catch (StockShortageException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
