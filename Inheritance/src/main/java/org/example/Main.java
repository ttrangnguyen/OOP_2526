package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //chúng ta có thể dùng một mảng kiểu Animal để "lưu" các đối tượng thuộc kiểu Animal và kiểu con của nó
        Animal[] array_animals = new Animal[3];
        array_animals[0] = new Dog();
        array_animals[0].name = "Jerry";
        array_animals[1] = new Cat();
        array_animals[1].name = "Cherry";
        array_animals[2] = new BlueDog();
        array_animals[2].name = "Tom";


        //Duyệt mảng bằng cách duyệt từng chỉ số
        for(int i = 0; i < array_animals.length; i++){
            //kiểu tham chiếu là kiểu Animal, trình biên dịch sẽ kiểm tra xem Animal có cài đặt makeNoise không,
            //nếu có thì sẽ dịch thành công.
            //Khi chạy chương trình, tuỳ vào kiểu đối tượng thực tế, JVM sẽ quyết định phiên bản phương thức makeNoise() nào được chạy
            //Đây chính là tính đa hình, cùng là makeNoise nhưng thể hiện khác nhau tuỳ vào đối tượng
            array_animals[i].makeNoise();
        }

        System.out.println("--------------------------");
        //Duyệt mảng bằng for each
        for(Animal a: array_animals){
            a.makeNoise();
        }

        System.out.println("--------------------------");

        //chúng ta có thể dùng một ArrayList để "lưu" các đối tượng
        ArrayList<Animal> arraylist_animals = new ArrayList<>();
        arraylist_animals.add(array_animals[0]);
        arraylist_animals.add(array_animals[1]);
        for(Animal a: arraylist_animals){
            a.makeNoise();
        }
        //truy xuất phần tử tại vị trí 0 của arraylist_animals
        Animal x = arraylist_animals.get(0);

        System.out.println("--------------------------");

        //up casting là nhìn nhận đối tượng lớp con như là một đối tượng lớp cha
        //a1 và a2 là các tham chiếu kiểu Animal,
        //Ta đang dùng tham chiếu kiểu Animal để tương tác với đối tượng Dog
        // compiler nhìn nhận là Animal (nghĩa là đối tượng Dog đang được nhìn nhận như đối tượng Animal, lớp cha của Dog)
        Animal a1 = new Dog();
        a1.name = "Happy";
        Dog d = new Dog();
        d.name = "Sad";
        Animal a2 = d;
        a1.makeNoise();
        a2.makeNoise();

        System.out.println("--------------------------");
        //down casting là nhìn nhận đối tượng lớp cha như là một đối tượng lớp con
        //a1 là một tham chiếu kiểu Animal
        //d là một tham chiếu kiểu Dog
        // Gán d = (Dog) a1: Compiler sẽ nhìn nhận là sẽ cho phép dùng một tham chiếu kiểu Dog tương tác với đối tượng kiểu Animal
        // (vì tham chiếu kiểu Animal đang tham chiếu tới)
        //Tuy nhiên, vì tham chiếu kiểu Dog sẽ có thể truy cập tới các phương thức của riêng Dog mà Animal không có, ví dụ play()
        //Do đó, phải ép kiểu tường minh khi down casting
        //Compiler sẽ báo lỗi nếu viết d = a1;
        d = (Dog) a1;
        d.play();

        Animal a3 = new Cat();
        //Tuy nhiên trong thực tế khi down casting có thể xảy trường hợp đối tượng mà tham chiếu Animal đang trỏ tới không phải đối tượng Dog
        //khi đó down casting sẽ xảy ra lỗi.
        //Để không xảy ra lỗi khi chạy, luôn kiểu tra kiểu đối tượng thông qua instanceof trước khi thực hiện downcasting
        if(a3 instanceof Dog){
            d = (Dog) a3;
        }
    }

}