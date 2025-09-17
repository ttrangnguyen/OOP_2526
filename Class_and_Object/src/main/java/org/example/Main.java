package org.example;


public class Main {
    public static void main(String[] args) {

        //Tạo một đối tượng Student thông qua constructor không có tham số,
        //các thuộc tính của đối tượng sẽ có giá trị mặc định.
        //s1 không phải là đối tượng, s1 là tham chiếu tới đối tượng
        //Nhưng thông thường chúng ta hay nói nhanh là đối tượng Student s1
        Student s1 = new Student();
        //Thực hiện gán các giá trị cho thuộc tính của đối tượng s1
        s1.setName("Nguyen Van A");
        s1.setID("25001");
        s1.setAge(19);
        System.out.println("S1 Info:");
        System.out.println(s1.getInfo());


        //Tạo đối tượng thông qua Constructor nhận vào 3 tham số
        //các thuộc tính của đối tượng được gán bằng các giá trị được truyền vào
        Student s2 = new Student("Nguyen Van B", "25002", 19);
        System.out.println("S2 Info:");
        System.out.println(s1.getInfo());

        Student s3 = new Student("Nguyen Van A", "25001", 19);
        System.out.println("S3 Info:");
        System.out.println(s3.getInfo());

        //giá trị lưu trên s1 và s3 là tham chiếu đối tượng, không phải là các giá trị thể hiện trạng thái của đối tượng
        //do đó khi so sánh s1 == s3 sẽ trả về false, vì tham chiếu khác nhau
        if(s1 == s3){
            System.out.println("s1 == s3 is true");
        }else{
            System.out.println("we cannot compare the values of two objects by == or != operators");
        }

        //Chúng ta sử dụng phương thức equals đã cài đè trong lớp Student để so sánh
        if(s1.equals(s3)){
            System.out.println("s1 and s3 has the same values");
        }

        OOP oop = new OOP();
        //Nếu không có instanceof (dòng 83, class Student), khi truyền đối tượng OOP vào equals ở đây
        //chương trình vẫn sẽ dịch được (compile)
        //tuy nhiên khi chạy sẽ lỗi, do không thể ép kiểu OOP về kiểu Student
        if(s1.equals(oop)){
            System.out.println("s1 and oop has the same values");
        }


        //x và y là các biến địa phương (local variables)
        //biến địa phương phải được khởi tạo trước khi sử dụng
        //kiểu dữ liệu của x và y là kiểu int, đây là kiểu nguyên thuỷ (primitive), không phải kiểu đối tượng
        //do đó, giá trị lưu trên vùng nhớ của x và y là giá trị binary của 7 (0000111)
        //chúng ta sử dụng == để so sánh x, y sẽ nhận được kết quả true
        int x = 7;
        int y = 7;
        if(x == y){
            System.out.println("x and y has the same values");
        }

        String hello1 = new String("Hello");
        String hello2 = new String("Hello");
        //String cũng là kiểu đối tượng do đó chúng ta cũng cần sử dụng equals để so sánh
        //String là lớp được cung cấp bởi thư viện chuẩn của Java, do đó phương thức equals đã được cài đặt sẵn
        if (hello1 == hello2){
            System.out.println("hello1 and hello2 has the same values");
        }

        String hello3 = "Hello";
        String hello4 = "Hello";
        //Trong trường hợp này dấu == trả về true vì hello3 và hello4 được khởi tạo với các giá trị literal
        //khi khởi tạo hello3 như trên JVM sẽ tạo ra một ô nhớ cho "Hello" trong String pool
        //tiếp theo khi khởi tạo hello4, thay vì tạo ra một ô nhớ mới,
        // JVM sẽ tham chiếu hello4 tới ô nhớ có giá trị "Hello" mà nó tạo trước đó trong String pool
        //String pool giúp tối ưu việc lưu trữ và sử dụng vùng nhớ với biến kiểu String
        if (hello3 == hello4){
            System.out.println("hello3 and hello4 has the same values");
        }

        //Phương thức main() là một phương thức static (dòng 6), do đó nó không thuộc về một đối tượng cụ thể nào cả
        //chi tiết về static chúng ta sẽ học ở bài sau.
        //Tuy nhiên, vì main() là static nên chúng ta
        // không gọi được các phương thức non-static (phương thức increase và increaseStudentAge) nếu không thông qua một đối tượng.
        //Để gọi hai phương thức này, chúng ta phải khai báo và khởi tạo một đối tượng Main (vì lớp này tên là lớp Main)
        Main test = new Main();
        //phương thức increase thực hiện tăng giá trị được truyền vào (+3),
        // tuy nhiên điều này không làm ảnh hưởng đến biến x của main() khi được truyền vào làm đối số của increase()
        test.increase(x);
        System.out.println("The value of x is unchanged:" + x);
        test.increaseStudentAge(s1);
        System.out.println(s1.getInfo());

        test.bar();

    }

    //Truyền tham số trong Java là truyền tham trị
    //giá trị được truyền vào sẽ được copy vào một biến địa phương
    //phương thức sẽ thao tác trên bến địa phương
    public int increase(int x){
        x += 3;
        return x;
    }

    //Giá trị được truyền vào sẽ được copy sang biến địa phương s của phương thức increaseStudentAge
    //Vì tham số là tham chiếu đối tượng nên giá trị được truyền vào copy sang biến địa phương chính là một tham chiếu
    //lúc này biến địa phương và đối số cùng tham chiếu tới một đối tượng
    public void increaseStudentAge(Student s){
        //vì cùng tham chiếu tới một đối tượng,
        // nên thay đổi tuổi ở đây sẽ ảnh hưởng tới tuổi của đối tượng Student mà đối số trỏ tới
        s.setAge(s.getAge() + 1);
        //Tuy nhiên việc gán s = null ở đây không ảnh hưởng gì tới đối số vì s và đối số là hai biến khác nhau,
        // ở hai ô nhớ khác nhau
        s = null;
    }

    //bar là phương thức non-static, nên có thể truy cập được đến increase() cũng là một phương thức non-static trong lớp này
    //mà không phải thông qua đối tượng giống trong main()
    public void bar(){
        int z = 1000;
        increase(z);
    }
}