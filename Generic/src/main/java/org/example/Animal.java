package org.example;

import java.util.Objects;

public class Animal implements Comparable {
    String name;
    public Animal(String _name){
        name = _name;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Animal){
            return name.equals(((Animal) o).name);
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Animal){
            String tmp = ((Animal) o).name;
           return name.compareTo(tmp);
        }
        return -1;
    }
}
