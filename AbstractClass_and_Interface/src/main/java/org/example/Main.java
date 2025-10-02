package org.example;

import hospital.Hospital;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Creating instances and adding into an arraylist: ");
        ArrayList<Animal> animals = new ArrayList();
        animals.add(new Dog("Happy"));
        animals.add(new Cat("Sad"));
        animals.add(new BlueDog("Excited"));
        System.out.println("************************");
        Hospital hospital = new Hospital();
        for (Animal a:animals){
            hospital.inject(a);
            System.out.println("-----------");
        }



        //upcasting
        Animal a = animals.get(1);
        a.makeNoise();

        //downcasting
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.play();
            d.eat();
        }

        System.out.println("Creating instances and adding into an arraylist: ");
        //Interface mang lại cho chúng ta lợi ích về đa hình giống như lớp cha (superclass)
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Dog());
        pets.add(new Cat());
        for(Pet p: pets){
            hospital.special_treatment(p);
            p.beFriendly();
            System.out.println("-----------");
        }

        Education e = new Dog("Jerry");
        e.research();

    }
}