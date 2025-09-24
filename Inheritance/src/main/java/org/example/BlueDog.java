package org.example;

//BlueDog là con của Dog,
// BlueDog có các thành phần của lớp Dog và Animal được khai báo khai báo public, protected, và default
public class BlueDog extends Dog{
    @Override
    public void makeNoise() {
        System.out.println("Calling from class BlueDog:");
        //từ lớp con, có thể truy cập tới các phương thức của lớp cha thông qua từ khoá super
        super.makeNoise();
        //Không thể truy cập đến makeNoise của Animal thông qua super.super
        //uncomment dòng 13, chương trình sẽ báo lỗi
        //super.super.makeNoise();
        System.out.println("BlueDog " + name + " is making noise");
    }
}
