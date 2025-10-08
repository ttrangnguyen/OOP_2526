package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList();

        //MAX_NUM là thuộc tính static của Animal
        //Chúng ta có thể truy cập tới thuộc tính hoặc phương thức static thông qua tên lớp
        if(animals.size() < Animal.MAX_NUM) {
            animals.add(new Dog("Happy"));
            animals.add(new BlueDog("Excited"));
            for (Animal a : animals) {
                a.makeNoise();
                System.out.println("-----------");
            }
        }

        System.out.println(Animal.getCount());
        System.out.println(animals.get(0).getCount());
    }
}