package org.example;

import java.io.Serializable;

public class Character implements Serializable {
    private String name;
    private int power = 1;
    private int age;

    public Character(){
        System.out.println("Character constructor");

    }
    public Character(String _name){
        System.out.println("Character constructor1");
        name = _name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void increasePower(){
        power = power*2;
    }
    public void increaseAge(){
        age += 1;
    }
}
