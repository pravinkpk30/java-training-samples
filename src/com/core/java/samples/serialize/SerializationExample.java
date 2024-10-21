package com.core.java.samples.serialize;

import com.core.java.samples.Employee;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        Employee employee = new Employee("Kumar", 101);
        Employee emp = new Employee("Praveen", 101, "Demo@1234");
        try {
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);  // Serializing the object
            out.close();
            fileOut.close();
            System.out.println("Employee object has been serialized and saved as employee.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
