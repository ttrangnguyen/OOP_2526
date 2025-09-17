package org.example;

import java.util.Objects;

public class Student {

    //name, age, id là các thuộc tính (biến thực thể/instance variables) của Student
    //Để tránh sự truy cập từ bên ngoài (lớp khác) và ngăn chặn việc gán các giá trị
    //không mong muốn cho thực thể, các biến thực thể thường được cài đặt mức truy cập private.
    //Khi khởi tạo đối tượng các biến thực thể có giá trị mặc định theo cài đặc của constructor tương ứng.
    //Nếu lớp không cài đặt constructor thì constructor mặc định sẽ được gọi, khi đó các giá trị mặc định sẽ là
    //0 cho kiểu int, false cho kiểu boolean, 0.0 cho kiểu float, null cho kiểu String...
    private String name;
    private int age;
    private String ID;

    //Student() là constructor, được gọi khi khởi tạo đối tượng
    public Student(){

    }

    public Student(String _name, String _ID, int _age){
        name = _name;
        ID = _ID;
        age = _age;
    }

    //Các phương thức setters được sử dụng để gán giá trị cho các biến thực thể
    //bên trong phương thức setters thường cài đặt các điều kiện
    // để đảm bảo biến thực thể không bị gán các giá trị không mong đợi,
    // ví dụ không cho phép gán giá trị âm cho biến age
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public void setName(String _name) {
        name = _name;
    }

    public void setID(String _ID) {
        ID = _ID;
    }

    //Các phương thức getters được sử dụng để đọc giá trị của các biến thực thể
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String getInfo(){
        return name + " " + ID + " " + age;
    }

    //Hai phương thức foo có cùng tên nhưng khác danh sách tham số
    //một phương thức không có tham số, một phương thức có một tham số
    //đây là hiện tượng nạp chồng (overloading)
    //Khi biên dịch chương trình, trình biên dịch sẽ dựa vào danh sách đối số được truyền vào
    //để xác định hàm foo nào được gọi
    public int foo(){
        age += 1;
        return age;
    }
    public  int foo(int x){
        age += x;
        return age;
    }

    //Để so sánh hai đối tượng Student, chúng ta cài đề phương thức equals của lớp Object
    @Override
    public boolean equals(Object o){
        //Mọi đối tượng đều là Object, để đảm bảo chúng ta chỉ ép kiểu và so sánh đối tượng Student
        //chúng ta kiểu tra xem tham số truyền vào có phải là thực thể của Student hay không
        //thông qua câu lệnh istanceof
        if (o instanceof Student) {
            Student s = (Student) o;
            return Objects.equals(s.name, name) && Objects.equals(s.ID, ID) && s.age == age;
        }
        return false;
    }


}
