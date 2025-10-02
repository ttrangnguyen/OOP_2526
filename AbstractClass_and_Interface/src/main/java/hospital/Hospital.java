package hospital;

import org.example.Animal;
import org.example.Pet;


public class Hospital {

    //Chúng ta có thể sử dụng Animal là kiểu của dữ liệu truyền vào
    //Nếu sau chúng ta bổ sung thêm các lớp mới kế thừa Animal
    //Thì phương thức inject này vẫn sử dụng được cho lớp mới đó mà không cần sửa đổi
    public void inject(Animal a){
        //getClass là phương thức của lớp Object
        //tất cả các lớp đều là lớp con của Object nên tất cả các đối tượng đều có thể gọi getClass()
        System.out.println("Injecting: " + a.getClass());
        a.makeNoise();
    }

    //Chúng ta cũng có thể dụng Interface là kiểu của dữ liệu truyền vào
    //phương thức special_treatment này có thể nhận vào bất kỳ đối tượng thuộc lớp nào cài đặt (implements) Pet
    public void special_treatment(Pet p){
        System.out.println("Special treatment for a pet: " + p.getClass());
    }


}
