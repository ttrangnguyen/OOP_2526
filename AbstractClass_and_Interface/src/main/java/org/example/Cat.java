package org.example;

public class Cat extends Animal implements Pet{

    public Cat(){
        System.out.println("Constructor Cat 0");
    }

    public Cat(String _name){
        System.out.println("Constructor Cat 1");
        name = _name;
    }
    @Override
    public void makeNoise() {
        System.out.println("Cat " + name + " is making noise");
    }

    @Override
    public void beFriendly() {
        System.out.println("Cat " + name + " is friendly");
    }

    @Override
    public void eat() {
        System.out.println("Cat " + name + " is eating");
    }
}
