package org.example;

public class BlueDog extends Dog{
    public BlueDog(){
        System.out.println("Constructor BlueDog 0");

    }

    public BlueDog(String _name){
        System.out.println("Constructor BlueDog 1");
        name = _name;
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("BlueDog " + name + " is making noise");
    }
}
