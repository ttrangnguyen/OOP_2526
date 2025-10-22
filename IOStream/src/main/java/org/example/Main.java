package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Game g = new Game("Lucky");
    static String play =   "no";

    public static void main(String[] args) {

        //Có hai cách phổ biến để lưu lại thuộc tính của các đối tượng

        //Cách 1: Lưu từng giá trị thuộc tính ra file theo cấu trúc được định nghĩa trước
        read_and_write_state_values_into_file();

        //Cách 2: "Nén" và lưu đối tượng ra file
//        read_and_write_objects();

    }

    public static void play_game(){
        do{
            System.out.println("Your score: " + g.getScore());
            System.out.println("Your character: " +
                    "name = "  + g.getCharacter().getName() + "; " +
                    "age = " + g.getCharacter().getAge() + "; " +
                    "power = " + g.getCharacter().getPower());
            System.out.println("Do you want to play game? (yes/no)");
            play = scanner.next();
            if(!play.equals("no")){
                System.out.println("Input a number: ");
                int x = scanner.nextInt();
                g.addScore(x + g.getLucky_number());
                g.getCharacter().increaseAge();
                g.getCharacter().increasePower();
            }
        }while (!play.equals("no"));
    }

    public static void read_and_write_state_values_into_file(){

        try {
            File file = new File("game.txt");
            //Tạo đối tượng FileReader để kết nối với file
            FileReader reader = new FileReader(file);
            //Tạo đối tượng BufferedReader để hỗ trợ việc đọc dữ liệu hiệu quả hơn
            BufferedReader bufferedReader = new BufferedReader(reader);
            //Đọc từng dòng dữ liệu
            //Lưu ý, chúng ta đã (ngầm) quy ước mỗi dòng sẽ lưu một thông tin, đầu tiên là score, sau đó là name, age, và cuối cùng là power
            //khi đọc dữ liệu và khởi tạo lại giá trị cho các thuộc tính, chúng ta cũng cần thực hiện theo đúng thứ tự này
            //Rủi ro rất lớn khi lưu dữ liệu kiểu này là thứ tự các thuộc tính có thể bị đọc nhầm
            String score = bufferedReader.readLine();
            g.setScore(new Integer(score));
            String name = bufferedReader.readLine();
            g.character.setName(name);
            String age = bufferedReader.readLine();
            g.character.setAge(new Integer(age));
            String power = bufferedReader.readLine();
            g.character.setPower(new Integer(power));
        } catch (FileNotFoundException e) {
            System.out.println("The first play");
        } catch (IOException e) {
            System.out.println("Exception while reading file");
            e.printStackTrace();
        }

        play_game();

        //Trước khi kết thúc trò chơi, sẽ ghi lại giá trị các thuộc tính của đối tượng ra file
        try {
            File results = new File("game.txt");
            //Tạo một đối tượng FileWriter để kết nối với file
            FileWriter writer = new FileWriter(results);
            //Thay vì ghi trực tiếp lên file chúng ta sẽ ghi lên Buffer để tăng độ hiệu quả của việc ghi
            //Khi buffer đầy, nó sẽ tự động ghi dữ liệu lên file
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            //Lần lượt ghi từng thuộc tính vào file theo một cấu trúc nào đó
            //Ở đây chúng ta ghi mỗi thuộc tính một dòng với thứ tự lần lượt là score, name, age, và power
            bufferedWriter.write(g.getScore() + "\n");
            bufferedWriter.write(g.getCharacter().getName() + "\n");
            bufferedWriter.write(g.getCharacter().getAge() + "\n");
            bufferedWriter.write(g.getCharacter().getPower() + "\n");
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("Write file exception");
            e.printStackTrace();
        }

    }

    public static void read_and_write_objects(){

        try {
            File file = new File("game_object.data");
            //Tạo một đối tượng FileInputStream để kết nối với file
            FileInputStream fileInputStream = new FileInputStream(file);
            //Tạo đối tượng ObjectInputStream để đọc dữ liệu
            ObjectInputStream os = new ObjectInputStream(fileInputStream);
            //Đọc thông tin đối tượng đã được lưu trong file thông qua phương thức readObject()
            //readObject() trả về kiểu Object, do đó cần cast về kiểu phù hợp
            //readObject() đọc thông tin của đối tượng và tạo ra đối tượng phù hợp trong heap, không gọi constructor của lớp tương ứng.
            //Trong ví dụ này, đối tượng Game sẽ được tạo ra trong heap mà không gọi constructor của Game
            //Tuy nhiên, nếu Game kế thừa lớp A, mà A không cài đặt Serializable thì constructor của A và các lớp cha của nó sẽ được gọi
            g = (Game) os.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("The first play");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        play_game();

        try{
            File file = new File("game_object.data");
            //Tạo một đối tượng FileOutputStream để kết nối với file
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //Tạo một đối tượng ObjectOutputStream để ghi đối tượng vào file
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            //Thực hiện việc ghi đối tượng ra file
            os.writeObject(g);
            os.close();
        } catch (IOException e) {
            System.out.println("Write object exception");
            e.printStackTrace();
        }
    }
}