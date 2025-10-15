package org.example;

//Pair là lớp tổng quát có 2 tham số kiểu T và U
//Khi khai báo một đối tượng Pair bạn có thể thay T và U
// bằng bất kỳ kiểu dữ liệu nào (trừ các kiểu nguyên thuỷ như int, float...)
public class Pair <T, U> {
    public T first;
    public U second;

    public Pair(){}
    public Pair(T _first, U _second) {
        first = _first;
        second = _second;

    }
    public T getFirst(){
        return first;
    }
    public void setFirst(T _first){
        first = _first;
    }

    public U getSecond(){
        return second;
    }
    public void setSecond(U _second){
        second = _second;
    }

}
