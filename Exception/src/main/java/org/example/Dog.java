package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Dog extends Animal{
    //khi lớp con Dog cài đè phương thức makeNoise của lớp cha Animal
    //phương thức makeNoise trong Animal khai báo ném ngoại lệ thuộc kiểu IOException
    //phương thức makeNoise trong Dog hoặc ném ngoại lệ kiểu IOException, hoặc ném ngoại lệ thuộc kiểu con của IOException, hoặc không ném ngoại lệ nào cả
    //Quy tắc này để đảm bảo những đoạn code nào chạy được với đối tượng kiểu Animal thì cũng sẽ chạy được với đối tượng kiểu Dog
    @Override
    public void makeNoise() throws FileNotFoundException {
        //do sth

        throw new FileNotFoundException();

    }
}
