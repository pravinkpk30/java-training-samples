package com.core.java.samples.generics;

public class GenericBoundedTypeClassExample {

    public static void main(String[] args) {

        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setNumber(123);
        System.out.println("Integer Value: " + intBox.getNumber());

//        NumberBox<String> stringBox = new NumberBox<>(); // Compile time error

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setNumber(123.12);
        System.out.println("Double Value: " + doubleBox.getNumber());

    }
}
