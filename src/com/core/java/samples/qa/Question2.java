package com.core.java.samples.qa;


import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

/***
 * 2. Collections: Using a TreeMap to Track Expiry Dates of Drug Batches
 *
 * Question: In the pharma supply chain, it's critical to track the expiry dates of drug batches.
 * Use a TreeMap to store drug batch numbers as keys and their corresponding expiry dates as values.
 * Implement a method to:
 * • Add a new batch with its expiry date.
 * • Print out all batches in the order of their expiry dates (from earliest to latest).
 *
 */
class PharmaSupplyChain {

    private TreeMap<LocalDate, String> batchMap;

    public PharmaSupplyChain() {
        batchMap = new TreeMap<>();
    }

    public void addBatch(String batchNumber, LocalDate expiryDate) {
        batchMap.put(expiryDate, batchNumber);
    }

    public void printBatchesByExpiry() {
        System.out.println("Drug Batches (ordered by expiry date):");
        for (Map.Entry<LocalDate, String> entry : batchMap.entrySet()) {
            System.out.println("Batch Number: " + entry.getValue() + ", Expiry Date: " + entry.getKey());
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        PharmaSupplyChain supplyChain = new PharmaSupplyChain();

        // Add some batches with their expiry dates
        supplyChain.addBatch("BatchA123", LocalDate.of(2025, 12, 31));
        supplyChain.addBatch("BatchB456", LocalDate.of(2023, 6, 15));
        supplyChain.addBatch("BatchC789", LocalDate.of(2024, 9, 20));

        supplyChain.printBatchesByExpiry();
    }
}
