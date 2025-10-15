package org.example;

import java.util.ArrayList;

public class Util {

    //search là phương thức tổng quát, có tham số kiểu T
    public static <T> int search(T[] arr, T x){
        if(arr != null && arr.length > 0){
            for(int i = 0; i < arr.length; i++){
                //Để so sánh đối tượng phương thức search sử dụng equals
                //Nếu T là lớp không override equals thì equals mặc định của Object sẽ được sử dụng
                //check Javadoc để biết equals của Object hoạt động như thế nào
                if(arr[i].equals(x)){
                    return i;
                }
            }
        }
        return -1;
    }

    //findMax là phương thức tổng quát, có tham số kiểu T
    //Để tìm được đối tượng lớn nhất, chúng ta cần so sánh các đối tượng
    //ở đây findMax so sánh thông qua phương thức compareTo (một phương thức quy định bởi interface Comparable), check javadoc của Comparable để biết đặc tả của compareTo
    //Để đảm bảo các kiểu dữ liệu khi sử dụng với phương thức findMax đều cài đặt phương thức compareTo, chúng ta quy định ràng buộc với T (T extends Comparable)
    //<T extends X>: điều này có nghĩa T phải là lớp X, lớp con của X, hoặc nếu X là interface thì T phải cài đặt interface X
    //Trong ví dụ này, T phải cài đặt Comparable thì mới có thể sử dụng được với phương thức findMax
    public static <T extends Comparable> T findMax(T[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        T res = arr[0];
        for(T element:arr) {
            if (res.compareTo(element)  < 0) {
                res = element;
            }
        }
        return res;
    }


    //Phương thức in các phần tử trong một ArrayList<T>, với ràng buộc T là Animal hoặc các lớp con của Animal
    public static <T extends Animal> void print1(ArrayList<T> list){
        for(T a : list){
            System.out.println(a.name);
        }
    }

    //Phương thức in các phần tử trong một ArrayList
    //phương này sử dụng ký tự đại diện ?
    //<? extends Animal> điều này thể hiện, khi gọi phương thức này chỗ dấu ? có thể thay thế là Animal hoặc bất kỳ lớp con nào của Animal
    public static void print2(ArrayList<? extends Animal> list){
        for(Animal a : list){
            System.out.println(a.name);
        }
    }

    //phương thức này nhận vào tham số là ArrayList<Animal>, nó chỉ có thể nhận vào tham số loại này
    //không thể nhận các tham số như ArrayList<Dog>
    //Lý do: ArrayList<Animal> và ArrayList<Dog> không có mối quan hệ kế thừa
    public static void print3(ArrayList<Animal> list){
        for(Animal a : list){
            System.out.println(a.name);
        }
    }



}
