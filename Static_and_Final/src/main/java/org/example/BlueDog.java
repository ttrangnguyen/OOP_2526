package org.example;

//BlueDog là class final
//Class final là class không thể được extend
//không thể tạo ra một class XXX extends BlueDog
public final class BlueDog extends Dog{
    public BlueDog(){
    }

    public BlueDog(String _name){
        name = _name;
    }
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("BlueDog " + name + " is making noise");
    }
}
