package org.example;



//Chúng ta có thể định nghĩa một loại ngoại lệ mới
//Ngoại lệ mới cần là lớp chuyên biệt của một lớp ngoại lệ sẵn có
//Trong phần lớn trường hợp, ta chỉ cần một lớp rỗng
//với tên ngoại lệ chuyên biệt cho chương trình của chúng ta

public class OOPException extends Exception {
    //Một lớp ngoại lệ điển hình chỉ chứa hai hàm khởi tạo
    public OOPException(){
    }
    public OOPException(String s){
        super(s);
    }

}
