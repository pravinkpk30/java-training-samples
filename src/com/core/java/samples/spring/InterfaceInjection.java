package com.core.java.samples.spring;

 interface DatabaseConnection {
    void connect();
}

 class MySQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL database");
    }
}

 class OracleDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connected to Oracle database");
    }
}

interface DatabaseAware { //Interface injection
    void setDatabaseConnection(DatabaseConnection databaseConnection);
}

class MedicineService implements DatabaseAware {
    private DatabaseConnection databaseConnection;

    @Override
    public void setDatabaseConnection(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void saveMedicineData() {
        if (databaseConnection != null) {
            databaseConnection.connect();
            System.out.println("Saving medicine data to database");
        } else {
            System.out.println("No database connection available");
        }
    }
}


public class InterfaceInjection {
    public static void main(String[] args) {
        // Create instances of the dependency and dependent
        DatabaseConnection mysqlConnection = new MySQLDatabaseConnection();
        MedicineService medicineService = new MedicineService();

        // Inject dependency via interface method
        medicineService.setDatabaseConnection(mysqlConnection);
        medicineService.saveMedicineData();

        // Switch to OracleDatabaseConnection
        DatabaseConnection oracleConnection = new OracleDatabaseConnection();
        medicineService.setDatabaseConnection(oracleConnection);
        medicineService.saveMedicineData();
    }
}
