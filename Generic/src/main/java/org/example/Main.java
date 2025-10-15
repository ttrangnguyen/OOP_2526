package org.example;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       //p1 là một tham chiếu tới đối tượng kiểu Pair
       //Trong trường hợp này T trong khai báo của lớp Pair sẽ được thay thế bằng Integer
       //U trong khai báo của lớp Pair sẽ được thay thế bằng String
       Pair<Integer, String> p1 = new Pair<>(new Integer(1), new String("a"));

       //p1 là một tham chiếu tới đối tượng kiểu Pair
       //Trong trường hợp này T trong khai báo của lớp Pair sẽ được thay thế bằng Integer
       //U trong khai báo của lớp Pair sẽ được thay thế bằng Integer
       Pair<Integer, Integer> p2 = new Pair<>(new Integer(1), new Integer(3));


        Animal[] animals = new Animal[2];
        animals[0] = new Animal("Hello");
        animals[1] = new Animal("OOP");
        System.out.println("Output of search in animals:" + Util.search(animals, new Animal("Hello")));
        System.out.println("--------");



        Integer[] integerlist = new Integer[2];
        integerlist[0] = new Integer(1);
        integerlist[1] = new Integer(2);
        System.out.println("Output of findMax in integerList:" + Util.findMax(integerlist));
        System.out.println("--------");

        //findMax trả về đối tượng Animal
        //khi println 1 đối tượng, phương thức sẽ sử dụng toString() của đối tượng để in ra thông tin về đối tượng
        //nếu Animal không cài đè toString() thì toString() mặc định của Object được gọi
        System.out.println("Output of findMax in animals:" + Util.findMax(animals));
        System.out.println("--------");

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Happy"));
        animalList.add(new Animal("Sad"));
        System.out.println("Print animalList with method print1");
        //print1 nhận vào tham số ArrayList<T> với ràng buộc <T extends Animal> nên ta có thể truyền vào đây ArrayList<Animal>
        Util.print1(animalList);
        System.out.println("--------");

        System.out.println("Print animalList with method print2");
        //print2 nhận vào tham số ArrayList<? extends Animal> nên ta có thể truyền vào đây ArrayList<Animal>
        Util.print2(animalList);
        System.out.println("--------");

        System.out.println("Print animalList with method print3");
        //print3 nhận vào tham số ArrayList<Animal> nên ta chỉ có thể truyền vào đây ArrayList<Animal>
        Util.print3(animalList);
        System.out.println("--------");


        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog("Jerry"));
        dogList.add(new Dog("Tom"));
        System.out.println("Print dogList with method print1");
        //print1 nhận vào tham số ArrayList<T> với ràng buộc <T extends Animal> nên ta có thể truyền vào đây ArrayList<Dog>
        Util.print1(dogList);
        System.out.println("--------");

        System.out.println("Print dogList with method print2");
        //print2 nhận vào tham số ArrayList<? extends Animal> nên ta có thể truyền vào đây ArrayList<Dog>
        Util.print2(dogList);
        System.out.println("--------");

       //print3 nhận vào tham số ArrayList<Animal> nên ta không thể truyền vào đây ArrayList<Dog>
       //uncomment dòng 76 chương trình sẽ báo lỗi khi dịch
//       Util.print3(dogList);


    }
}