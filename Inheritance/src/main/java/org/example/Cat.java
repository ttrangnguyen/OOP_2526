package org.example;

public class Cat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Calling from class Cat:");
        System.out.println("Cat " + name + " is making noise");
    }
}
