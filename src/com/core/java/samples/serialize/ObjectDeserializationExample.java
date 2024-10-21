package com.core.java.samples.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import com.core.java.samples.Employee;

public class ObjectDeserializationExample {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee emp =  (Employee) ois.readObject();
            System.out.println("Name: " + emp.getName() + ", ID: " + emp.getId());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
