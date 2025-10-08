package org.example;



public class Dog extends Animal {

    public  Dog(){
    }

    public Dog(String _name){
        super(_name);
    }

    @Override
    public void makeNoise(){
        System.out.println("Dog " + name + " is making noise");
    }

    public void makeNoise(int x){
        for(int i = 0; i < x; i++){
            System.out.println("Dog " + name + " is making noise");
        }
    }

    public void play(){
        System.out.println("Dog " + name + " is playing");
    }


}
