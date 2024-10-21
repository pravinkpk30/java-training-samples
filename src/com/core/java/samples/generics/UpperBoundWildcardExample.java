package com.core.java.samples.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcardExample {

    // Method using an upper-bounded wildcard
    public static void makeAnimalsSound(List<? extends Animal> list) {
        for (Animal animal : list) { // You can safely access elements as Animal
            animal.sound();  // Calls the overridden sound method
        }
//         list.add(new Dog()); // Not allowed, as we don't know the exact type of list
    }

    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Dog());
        animalList.add(new Cat());

        makeAnimalsSound(dogList);   // OK, Dog is a subclass of Animal
        makeAnimalsSound(catList);   // OK, Cat is a subclass of Animal
        makeAnimalsSound(animalList); // OK, Animal itself is allowed

        // You cannot add new elements to the list in the makeAnimalsSound method
    }
}

