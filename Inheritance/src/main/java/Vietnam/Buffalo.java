package Vietnam;

import org.example.Animal;

//Buffalo là lớp con của Animal
//Buffalo ở khác package với Animal
//Buffalo có các thành phần (thuộc tính và phương thức) mà Animal khai báo public và protected
public class Buffalo extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Calling from class Buffalo:");
        System.out.println("Buffalo " + name + " is making noise");
    }
}
