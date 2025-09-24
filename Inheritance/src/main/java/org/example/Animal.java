package org.example;

//Animal cài đặt các thuộc tính và
// phương thức chung của các loài động vật
public class Animal {
    //Mức truy cập của biến name là public, biến name có thể được truy cập từ bất kỳ đâu,
    //bên ngoài class Animal
    public String name;

    //Mức truy cập của biến age là default (package), biến age có thể được truy cập từ
    // các lớp trong cùng package với class Animal
    int age;

    //Mức truy cập của biến food là protected, biến food có thể được truy cập từ
    // các lớp trong cùng package với class Animal
    // hoặc các lớp con của Animal (có thể trong cùng hoặc khác package) với Animal
    protected String food;

    //Mức truy cập của biến weight là private, biến weight chỉ có thể được truy cập bên trong class Animal
    private int weight;


    public void eat(){
        System.out.println("Animal is eating " + food);
    }

    public void makeNoise(){
        System.out.println("Calling from class Animal:");
        System.out.println("Animal is making noise");
    }
}
