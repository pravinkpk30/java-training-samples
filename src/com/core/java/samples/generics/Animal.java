package com.core.java.samples.generics;

class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}
