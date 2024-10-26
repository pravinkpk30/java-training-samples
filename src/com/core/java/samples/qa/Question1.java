package com.core.java.samples.qa;


import java.util.ArrayList;
import java.util.List;

/****
 * 1. Generics: Tracking Shipment Details with Generics
 *
 * Question: In a drug supply chain, shipments can contain different types of items such as raw materials,
 * intermediate compounds, or final drug products. Implement a generic class Shipment that can store and retrieve details about
 * these items. Add functionality to:
 * • Add an item to the shipment.
 * • Get a list of all items in the shipment.
 *
 * @param <T>
 */
class Shipment<T> {
    private List<T> items;

    public Shipment() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}
public class Question1 {
    public static void main(String[] args) {
        // Example with raw materials
        Shipment<String> rawMaterialShipment = new Shipment<>();
        rawMaterialShipment.addItem("Chemical A");
        rawMaterialShipment.addItem("Chemical B");

        System.out.println("Raw Materials Shipment: " + rawMaterialShipment.getItems());

        // Example with final drug products
        Shipment<String> finalProductShipment = new Shipment<>();
        finalProductShipment.addItem("Drug X");
        finalProductShipment.addItem("Drug Y");

        System.out.println("Final Product Shipment: " + finalProductShipment.getItems());
    }
}
