package com.core.java.samples.spring;

interface InventoryChecker {
    boolean checkStock(String medicineName);
}

class OnlineInventoryChecker implements InventoryChecker {
    @Override
    public boolean checkStock(String medicineName) {
        System.out.println("Checking stock online for " + medicineName);
        // Assume some logic to check online inventory
        return true;
    }
}

class LocalInventoryChecker implements InventoryChecker {
    @Override
    public boolean checkStock(String medicineName) {
        System.out.println("Checking stock in local pharmacy for " + medicineName);
        // Assume some logic to check local inventory
        return false;
    }
}

class PharmacyService {
    private InventoryChecker inventoryChecker;

    // Setter Injection
    public void setInventoryChecker(InventoryChecker inventoryChecker) {
        this.inventoryChecker = inventoryChecker;
    }

    public void checkMedicineAvailability(String medicineName) {
        if (inventoryChecker != null && inventoryChecker.checkStock(medicineName)) {
            System.out.println(medicineName + " is available in stock.");
        } else {
            System.out.println(medicineName + " is out of stock.");
        }
    }
}


public class SetterInjection {
    public static void main(String[] args) {
        PharmacyService pharmacyService = new PharmacyService();

        // Injecting OnlineInventoryChecker using setter injection
        InventoryChecker onlineChecker = new OnlineInventoryChecker();
        pharmacyService.setInventoryChecker(onlineChecker);

        pharmacyService.checkMedicineAvailability("Aspirin");

        // Changing to LocalInventoryChecker using the same setter
        InventoryChecker localChecker = new LocalInventoryChecker();
        pharmacyService.setInventoryChecker(localChecker);

        pharmacyService.checkMedicineAvailability("Ibuprofen");
    }
}
