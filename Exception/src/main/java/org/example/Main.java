package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        //Khối logic được
        //bọc trong khối try, khối này có thể ném ra ngoại lệ
        //khi ngoại lệ được ném ra, các khối catch sẽ được kiểm tra tuần tự từ trên xuống, khối catch nào bắt được ngoại lệ thì sẽ được thực thi
        //ngoại lệ cũng là đối tượng, nó cũng có các tính chất kế thừa và đa hình
        //Do đó, khi sắp xếp thứ tự các khối catch, khối catch nào bắt ngoại lệ cụ thể cần được xếp trước, khối catch nào bắt ngoại lệ tổng quát hơn thì xếp sau
        try {
            //scanner.nextInt() có thể ném ra ngoại lệ thuộc loại InputMismatchException
            //Tuy nhiên đây là một loại ngoại lệ thuộc nhóm unchecked
            //Các ngoại lệ là lớp con của RuntimeException đều là ngoại lệ unchecked
            // (ví dụ NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException...)
            //Compiler không quan tâm đến việc các ngoại lệ này được ném ra ở đâu, chúng có được xử lý không
            //vì các ngoại lệ thường gây ra bởi lỗi logic của lập trình viên.
            //Do đó, với các ngoại lệ này bạn có thể xử lý bằng khối try-catch, hoặc ném tiếp, hoặc không làm gì cả
            // Compiler vẫn dịch chương trình thành không
            //Tuy nhiên, nếu ngoại lệ không được xử lý, khi có ngoại lệ bị ném ra, chương trình vẫn bị crashed
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input numerator: ");
            int numerator = scanner.nextInt();
            System.out.println("Input denominator: ");
            int denominator = scanner.nextInt();
            Calculator c = new Calculator();
            //khi thực hiện phép chi trong fraction có thể xảy ra ngoại lệ ArithmeticException nếu mẫu số bằng 0
            System.out.println(c.fraction(numerator, denominator));
        }
        catch (InputMismatchException e){
            System.out.println("Input is in incorrect type");
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero");
        }
        //Khối finally là khối luôn luôn được thực thi dù ngoại lệ có xảy ra hay không
        finally {
            System.out.println("Finally block is running");
        }

        //read có thể ném ra một ngoại lệ FileNotFoundException (xem trong class FileWriter)
        //khi main gọi đến read, phương thức main cần xử lý ngoại lệ này (bọc trong khối try/catch hoặc né bằng cách ném tiếp) nếu không compiler sẽ không có dịch chương trình
        //việc các phương thức né ngoại lệ bằng cách ném tiếp đi thực ra chỉ là đang delay việc xử lý cho nơi gọi nó.
        //Nếu ngoại lệ xảy ra mà main không bắt nó mà né (ném tiếp đi) thì ngoại lệ sẽ rơi xuống nơi gọi main (máy ảo Java)
        //và khi đó chương trình vẫn bị crash
        FileWriter.read("oop.txt");

    }


}