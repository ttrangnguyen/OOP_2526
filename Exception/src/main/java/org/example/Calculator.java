package org.example;

import java.util.Scanner;

public class Calculator {

    public int fraction(int x, int y) {
        return x / y;
    }

    //Một phương thức khai báo ném ra một loại ngoại lệ bằng các khai báo throws + kiểu ngoại lệ tại khai báo tên phương thức
    //Một phưng thức có thể ném nhiều loại ngoại lệ
    public void foo(int x, int y) throws OOPException{
        if(x < 0 || y < 0){
            throw new OOPException();
        }
        System.out.println("Completing foo: " +  (x + y));
    }

    //Có ba cách để xử lý ngoại lệ
    //cách 1: bọc trong khối try/catch
    public void bar(int x, int y){
        try {
            foo(x, y);
        }catch (OOPException e){
            System.out.println("Foo threw an exception and bar catched");
        }
    }

    //Có ba cách để xử lý ngoại lệ
    //cách 2: né ngoại lệ bằng cách ném tiếp
    public void blah(int x, int y) throws OOPException{
       foo(x, y);
    }

    //Có 3 cách để xử lý ngoại lệ
    //cách 3: bắt ngoại lệ xử lý một phần và nép tiếp đi
    public void blaz(int x, int y) throws ArithmeticException{
        try{
            foo(x, y);
        }catch(OOPException e){
            System.out.print("Handling a part...");
            throw new ArithmeticException();
        }
    }


}
