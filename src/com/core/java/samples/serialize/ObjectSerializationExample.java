package com.core.java.samples.serialize;

import com.core.java.samples.Employee;

import java.io.*;

class User implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int id;
    User(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class ObjectSerializationExample {
    public static void main(String[] args) {
        Employee emp = new Employee("Praveen", 101);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(emp);  // Writing the object
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
