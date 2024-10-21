package com.core.java.samples.serialize;

import com.core.java.samples.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        Employee employee = null;
        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            employee = (Employee) in.readObject();  // Deserializing the object
            in.close();
            fileIn.close();
            System.out.println("Deserialized Employee:");
            System.out.println("Name: " + employee.getName());
            System.out.println("ID: " + employee.getId());
            System.out.println("Password: " + employee.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

