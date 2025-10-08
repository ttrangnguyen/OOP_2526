package org.example;


public abstract class Animal {

    //MAX_NUM là thuộc tính static, thuộc tính static là thuộc tính của lớp
    //Các cả các đối tượng thuộc lớp Animal (bao gồm cả các lớp con của Animal) đều "dùng chung" một biến MAX_NUM
    public final static int MAX_NUM;
    //Ngoài ra MAX_NUM còn là một biến final/biến hằng
    //Với biến lớp (static) và là hằng (final), chúng ta cần khởi tại giá trị cho nó ngay tại vị trí khai báo biến (dòng 8)
    //hoặc bên trong khối static (như dòng 12-14)
    static{
        MAX_NUM = 100;
    }

    //color là instance variable (biến thực thể) --> mỗi đối tượng được khởi tạo có một phiên bản biến color riêng
    //đồng thời color cũng được khai báo là hằng (final)
    //với biến thực thể là biến hằng, cần khởi tạo giá trị cho biến tại vị trí khai báo biến (dòng 21)
    //hoặc trong các constructors
    //Các biến hằng (final) là các biến không thể thay đổi giá trị sau khi đã khởi tạo
    public final String color;

    private static int count = 0;



    public String name;

    int age;
    protected String food;

    private int weight;

    public Animal(){
        count++;
        color = "Blue";
    }

    public Animal(String _name){
        count++;
        this.color = "red";
        name = _name;
    }

    public Animal(String _name, String _color){
        count++;
        name = _name;
        color = _color;
    }

    //getCount là phương thức static/phương thức của lớp
    //các phương thức static thuộc về lớp, không thuộc về riêng đối tượng
    //do đó, nó không thể truy cập các thuộc tính/phương thức của đối tượng.
    //Nói cách khác, các phương thức static không thể truy cập các thuộc tính/phương thức non-static.
    //Tuy nhiên, các phương thức non-static có thể truy cập đến các thuộc tính/phương thức static
    public static int getCount(){
        return count;
    }

    public void eat(){

        System.out.println("Animal is eating " + food);
    }

    public abstract void makeNoise();

    //sleep là phương thức final
    //phương thức final là phương thức không thể bị cài đề bởi lớp con
    public final void sleep(){
        System.out.println("Animal " + name + " is sleeping");
    }

}