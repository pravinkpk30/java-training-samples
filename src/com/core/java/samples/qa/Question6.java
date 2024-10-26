package com.core.java.samples.qa;

/****
 * 6. Generics: Using Generics for Drug Inventory Management
 * Question:
 * You need to manage an inventory of different types of drug containers (e.g., liquid vials, tablets, or
 * powders). Implement a generic Inventory<T> class that can manage different container types, with
 * methods to:
 * • Add containers to the inventory.
 * • Retrieve the list of containers.
 *
 */

import java.util.ArrayList;
import java.util.List;

// Generic class for managing inventory of various types of drug containers
class Inventory<T> {
    private List<T> containers;

    // Constructor to initialize the list
    public Inventory() {
        containers = new ArrayList<>();
    }

    // Method to add a container to the inventory
    public void addContainer(T container) {
        containers.add(container);
        System.out.println("Container added: " + container);
    }

    // Method to retrieve the list of all containers
    public List<T> getContainers() {
        return containers;
    }
}

// Classes representing different types of drug containers
class Vial {
    private String liquidName;

    public Vial(String liquidName) {
        this.liquidName = liquidName;
    }

    @Override
    public String toString() {
        return "Vial of " + liquidName;
    }
}

class Tablet {
    private String tabletName;

    public Tablet(String tabletName) {
        this.tabletName = tabletName;
    }

    @Override
    public String toString() {
        return "Tablet of " + tabletName;
    }
}

class Powder {
    private String powderName;

    public Powder(String powderName) {
        this.powderName = powderName;
    }

    @Override
    public String toString() {
        return "Powder of " + powderName;
    }
}

public class Question6 {
    public static void main(String[] args) {
        // Create an inventory for Vial containers
        Inventory<Vial> vialInventory = new Inventory<>();
        vialInventory.addContainer(new Vial("Sodium Chloride"));
        vialInventory.addContainer(new Vial("Glucose Solution"));

        // Create an inventory for Tablet containers
        Inventory<Tablet> tabletInventory = new Inventory<>();
        tabletInventory.addContainer(new Tablet("Aspirin"));
        tabletInventory.addContainer(new Tablet("Ibuprofen"));

        // Create an inventory for Powder containers
        Inventory<Powder> powderInventory = new Inventory<>();
        powderInventory.addContainer(new Powder("Penicillin"));
        powderInventory.addContainer(new Powder("Amoxicillin"));

        // Retrieve and print all Vial containers
        System.out.println("\nVial Inventory:");
        for (Vial vial : vialInventory.getContainers()) {
            System.out.println(vial);
        }

        // Retrieve and print all Tablet containers
        System.out.println("\nTablet Inventory:");
        for (Tablet tablet : tabletInventory.getContainers()) {
            System.out.println(tablet);
        }

        // Retrieve and print all Powder containers
        System.out.println("\nPowder Inventory:");
        for (Powder powder : powderInventory.getContainers()) {
            System.out.println(powder);
        }
    }
}
