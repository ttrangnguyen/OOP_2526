package org.example;


import java.io.Serializable;
import java.util.Random;

//Để có thể chuỗi hoá và lưu được dưới dạng đối tượng, các lớp cần implement interface Serializable
public class Game extends A implements Serializable{
    private int score = 0;
    Character character = new Character();
    //biến lucky_number này được lấy ngẫu nhiên tại mỗi lần chơi, do đó khi lưu đối tượng Game chúng ta không cần lưu thông tin của biến này
    //việc khai báo transient, khi chuỗi hoá và lưu thông tin của đối tượng, JVM sẽ bỏ qua thông tin của biến này
    //khi khôi phục lại đối tượng (deserializable), các biến được khai báo transient sẽ có các giá trị mặc định (0, null, false...)
    transient private int lucky_number;


    public Game(){
        System.out.println("Game constructor");
        character = new Character("Hello");
    }
    public Game(String _character_name){
        System.out.println("Game constructor1");
        character = new Character(_character_name);
    }
    public Character getCharacter() {
        return character;
    }

    public void addScore(int x){
        score += x;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public int getLucky_number(){
        Random rand = new Random();
        return rand.nextInt(10);
    }

}