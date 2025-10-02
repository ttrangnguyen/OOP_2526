package org.example;

//Dog là một lớp kế thừa Animal và cài đặt interface Pet và Education
//Do đó, Dog có các phương thức của Animal đã cài đặt và Dog cần cài đặt các phương thức quy định bởi interface Pet và Education
// Dog là lớp cụ thể đầu tiên trên câu thừa kế, nên Dog buộc phải cài đặt tất cả các phương thức abstract trong các lớp cha của
//Chúng ta chỉ có thể extends tối đa 1 lớp
//nhưng có thể implements nhiều interface

public class Dog extends Animal implements Pet, Education{

    public  Dog(){
        System.out.println("Constructor Dog 0");
    }

    //Khi gọi constructor của Dog, các constructor của lớp Cha của Dog (gồm có Animal và Object) sẽ được tự động gọi
    //Constructor tự động được gọi là constructor không có tham số
    //Muốn gọi tường minh constructor của lớp cha, cần gọi thông qua từ khoá super
    //Việc gọi constructor của lớp cha phải được thực hiện đầu tiên, trức bất kỳ câu lệnh nào trong constructor của lớp con
    public Dog(String _name){
        super(_name);
        System.out.println("Constructor Dog 1");
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog " + name + " is making noise");
    }

    public void makeNoise(int x){
        for(int i = 0; i < x; i++){
            System.out.println("Dog " + name + " is making noise");
        }
    }

    public void play(){
        System.out.println("Dog " + name + " is playing");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog " + name + " is friendly");
    }

    @Override
    public void eat() {
        System.out.println("Dog " + name + " is eating");
    }

    @Override
    public void research() {
        System.out.println("Researching about Dog " + name);
    }

}
