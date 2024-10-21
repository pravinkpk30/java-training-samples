package com.core.java.samples.generics;

public class GenericClassExample {
    public static void main(String[] args) {
        // Creating a GenericBox for Integer
        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setItem(123);
        System.out.println("Integer Value: " + intBox.getItem());

        // Creating a GenericBox for String
        GenericBox<String> strBox = new GenericBox<>();
        strBox.setItem("Hello Generics");
        System.out.println("String Value: " + strBox.getItem());

        Triple<Integer,String,Double> box = new Triple<>(12,"Java",30.23);
        Triple<Integer,String,Double> box1 = new Triple<>(23,"Javascript",50.63);

        System.out.println("Result : " + box.getFirst() + " -- " + box.getSecond() +" -- "+ box.getThird());

    }
}
