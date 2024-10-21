package com.core.java.samples.generics;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcardExample {

    // Method using a lower-bounded wildcard
    public static void addAnimal(List<? super Dog> list) {
        list.add(new Dog());  // Allowed, as Dog is of type Dog
//         list.add(new Animal()); // Not allowed, as Animal is not a subclass of Dog
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        addAnimal(animalList);  // OK, Animal is a superclass of Dog
        addAnimal(objectList);  // OK, Object is a superclass of Dog

        // Print the contents of animalList
        for (Object obj : animalList) {
            Animal animal = (Animal) obj;
            animal.sound(); // This will call the `sound` method of Dog
        }
    }
}

