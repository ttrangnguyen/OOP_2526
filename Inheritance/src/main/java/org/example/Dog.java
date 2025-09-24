package org.example;

//Dog là lớp con của Animal
//Dog có các thành phần (thuộc tính và phương thức) mà Animal khai báo public, protected, và default
public class Dog extends Animal{

    //Dog có thể cài đè các phương thức của Animal
    //Nguyên tắc của việc cài đè:
    //Lớp con cài đè phương thức của lớp cha cần:
    //1. Kiểu tham số phải giống nhau
    //2. kiểu trả về phải tương thích
    //3. Phạm vi truy cập phương thức ở lớp con không thể nhỏ hơn ở lớp cha
    @Override
    public void makeNoise() {
        System.out.println("Calling from class Dog:");
        System.out.println("Dog " + name + " is making noise");
    }

    //Phương thức makeNoise(int x) này là nạp chồng (overloading)
    // không liên quan tới tính đa hình
    // phương thức này chỉ có ở đối tượng Dog
    // khi chạy chương trình, JVM sẽ lựa chọn makeNoise dựa trên số lượng tham số tương ứng
    public void makeNoise(int x){
        for(int i = 0; i < x; i++){
            System.out.println("Dog " + name + " is making noise");
        }
    }

    //Dog có thể cài đặt các phương thức của riêng nó
    public void play(){
        System.out.println("Dog " + name + " is playing");
    }

}
