package HomeWork_1;
import java.util.Scanner;
public class Exercise_5_if {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(name.equals(name = "Вася")){
            System.out.println("Привет!\n Я тебя так долго ждал!");
        }
        if(name.equals(name = "Анастасия")){
            System.out.println("Я тебя так долго ждал!");
        }
        if(name.equals(name!="Вася" || name!="Анастасия")){
            System.out.println("Добрый день, а вы кто?");
        }
    }
}

