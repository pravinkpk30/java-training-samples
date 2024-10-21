package com.core.java.samples;

import java.io.Serializable;

public class Employee implements Serializable {
        private static final long serialVersionUID = 1L;  // Ensures compatibility across versions
        String name;
        int id;

        transient String password;  // This field won't be serialized

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public Employee(String name, int id, String password) {
            this.name = name;
            this.id = id;
            this.password = password;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }
}
