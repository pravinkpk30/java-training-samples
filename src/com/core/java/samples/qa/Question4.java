package com.core.java.samples.qa;

import java.time.LocalDate;

/****
 *
 * 4. Propagation of Exceptions: Handling Multiple Issues in Drug Shipments
 * Question:
 * In the drug supply chain, multiple checks are performed before dispatching a shipment, such as verifying
 * the expiry dates, checking for temperature deviations, and ensuring proper packaging. Implement
 * methods that check for these conditions, throw relevant exceptions, and use exception propagation to
 * handle them in the main method.
 *
 */
class DrugShipmentManager {

    public void verifyExpiry(LocalDate expiryDate) throws IllegalArgumentException {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.isAfter(expiryDate)) {
            throw new IllegalArgumentException("Expiry check failed: The batch is expired.");
        }
    }

    public void checkTemperature(double temperature) throws IllegalStateException {
        double minTemp = 2.0;
        double maxTemp = 8.0;
        if (temperature < minTemp || temperature > maxTemp) {
            throw new IllegalStateException("Temperature deviation detected: The temperature is out of range.");
        }
    }

    public void verifyPackaging(boolean isPackagingSealed) throws IllegalStateException {
        if (!isPackagingSealed) {
            throw new IllegalStateException("Packaging check failed: Packaging is not properly sealed.");
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        DrugShipmentManager shipmentManager = new DrugShipmentManager();

        LocalDate expiryDate = LocalDate.of(2023, 5, 10);
        double shipmentTemperature = 10.0;
        boolean isPackagingSealed = false;

        try {
            shipmentManager.verifyExpiry(expiryDate);
            shipmentManager.checkTemperature(shipmentTemperature);
            shipmentManager.verifyPackaging(false);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Shipment checks completed successfully!");
    }
}
