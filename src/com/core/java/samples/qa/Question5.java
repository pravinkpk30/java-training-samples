package com.core.java.samples.qa;

import java.time.LocalDate;
import java.util.PriorityQueue;

/****
 * 5. Collections: Using a PriorityQueue for Urgent Drug Shipments
 * Question:
 * In a supply chain, some drug shipments may be marked as high-priority, meaning they must be
 * dispatched before others. Use a PriorityQueue to manage drug shipments, where shipments with earlier
 * dispatch deadlines have higher priority. Implement methods to:
 * • Add shipments to the queue.
 * • Process (remove) the highest-priority shipment.
 *
 */
class Shipment1 implements Comparable<Shipment1> {
    private String shipmentId;
    private LocalDate dispatchDeadline;

    public Shipment1(String shipmentId, LocalDate dispatchDeadline) {
        this.shipmentId = shipmentId;
        this.dispatchDeadline = dispatchDeadline;
    }

    public LocalDate getDispatchDeadline() {
        return dispatchDeadline;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    @Override
    public int compareTo(Shipment1 other) {
        return this.dispatchDeadline.compareTo(other.getDispatchDeadline());
    }

    @Override
    public String toString() {
        return "Shipment ID: " + shipmentId + ", Dispatch Deadline: " + dispatchDeadline;
    }
}

class PriorityShipmentManager {

    private PriorityQueue<Shipment1> shipmentQueue = new PriorityQueue<>();

    public void addShipment(Shipment1 shipment) {
        shipmentQueue.offer(shipment);
        System.out.println("Shipment added: " + shipment);
    }

    public void processHighestPriorityShipment() {
        Shipment1 nextShipment = shipmentQueue.poll();
        if (nextShipment != null) {
            System.out.println("Processing shipment: " + nextShipment);
        } else {
            System.out.println("No shipments to process.");
        }
    }
}

public class Question5 {
    public static void main(String[] args) {
        PriorityShipmentManager manager = new PriorityShipmentManager();

        Shipment1 shipment1 = new Shipment1("ShipmentA", LocalDate.of(2024, 10, 25));
        Shipment1 shipment2 = new Shipment1("ShipmentB", LocalDate.of(2024, 10, 20));
        Shipment1 shipment3 = new Shipment1("ShipmentC", LocalDate.of(2024, 11, 1));

        manager.addShipment(shipment1);
        manager.addShipment(shipment2);
        manager.addShipment(shipment3);

        // Process the highest-priority shipment (should be ShipmentB with the earliest deadline)
        manager.processHighestPriorityShipment();

        // Process the next highest-priority shipment (should be ShipmentA)
        manager.processHighestPriorityShipment();

        // Process the remaining shipment (should be ShipmentC)
        manager.processHighestPriorityShipment();

        // Try to process when no shipments remain
        manager.processHighestPriorityShipment();
    }
}
