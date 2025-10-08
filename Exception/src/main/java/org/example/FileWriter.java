package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWriter {

    public static void read(String filename) throws FileNotFoundException {
        File file = new File(filename);
        //Scanner có thể ném ra một exception thuộc loại FileNotFoundException
        //Trong chương trình có gọi đến Scanner, cần xử lý exception này.
        //FileNotFoundException thuộc loại ngoại lệ checked.
        // Nghĩa là khi chương trình gọi đến các phương thức có ném ra các ngoại lệ trong nhóm checked,
        //compiler sẽ kiểm tra xem chương trình có xử lý ngoại lệ đó không (bọc nó trong try-catch hoặc né bằng cách ném tiếp).
        //Nếu chương trình chưa xử lý ngoại lệ, compiler sẽ không cho dịch chương trình.
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String data = reader.nextLine();
            System.out.println(data);
        }

    }

}
