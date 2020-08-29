package HomeWork_1;
import java.util.Scanner;
public class Exercise_5_Switch {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        switch (name){
            case "Вася":
                System.out.println("Привет!\n Я тебя так долго ждал!");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал!");
                break;
            default:
                System.out.println("Старнно, что я  тебя не знаю, как еще раз тебя зовут?");
                String name_2 = scanner.nextLine();
                System.out.println("Приятно познакомиться, " + name_2);
        }
    }
}