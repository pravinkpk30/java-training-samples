package com.core.java.samples.qa;

/****
 *
 * 10. Exception Propagation: Verifying Drug Shipment
 * Question:
 * Implement a method that verifies a drug shipment by performing multiple checks (e.g., check stock,
 * verify expiry, check packaging). Each check may throw its own exception. Ensure that exceptions
 * propagate and are handled appropriately in the main method.
 *
 *
 */

// Custom exception for stock shortage
class StockShortageException1 extends Exception {
    public StockShortageException1(String message) {
        super(message);
    }
}

// Custom exception for expired drugs
class ExpiryException extends Exception {
    public ExpiryException(String message) {
        super(message);
    }
}

// Custom exception for packaging issues
class PackagingException extends Exception {
    public PackagingException(String message) {
        super(message);
    }
}

class DrugShipment {

    // Example inventory map to simulate stock checking
    private static final int AVAILABLE_STOCK = 50; // Simulated available stock
    private static final boolean IS_EXPIRED = false; // Simulated expiry status
    private static final boolean IS_PACKAGED_CORRECTLY = true; // Simulated packaging status

    // Method to check stock availability
    private void checkStock(int requestedQuantity) throws StockShortageException1 {
        if (requestedQuantity > AVAILABLE_STOCK) {
            throw new StockShortageException1("Not enough stock available. Requested: " + requestedQuantity + ", Available: " + AVAILABLE_STOCK);
        }
    }

    // Method to check expiry
    private void checkExpiry() throws ExpiryException {
        if (IS_EXPIRED) {
            throw new ExpiryException("The drug has expired.");
        }
    }

    // Method to check packaging
    private void checkPackaging() throws PackagingException {
        if (!IS_PACKAGED_CORRECTLY) {
            throw new PackagingException("Packaging is not correct.");
        }
    }

    // Method to verify the shipment by performing multiple checks
    public void verifyShipment(int requestedQuantity) throws StockShortageException1, ExpiryException, PackagingException {
        checkStock(requestedQuantity); // Check stock
        checkExpiry(); // Verify expiry
        checkPackaging(); // Check packaging
        System.out.println("Shipment verified successfully.");
    }
}

public class Question10 {
    public static void main(String[] args) {
        DrugShipment shipment = new DrugShipment();
        int requestedQuantity = 60; // Example requested quantity

        try {
            shipment.verifyShipment(requestedQuantity); // Attempt to verify the shipment
        } catch (StockShortageException1 | ExpiryException | PackagingException e) {
            // Handle exceptions with a clear error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
