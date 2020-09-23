package HomeWork_2;

import java.util.Scanner;

public class HomeWork_2_Exercise_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введеите число, которое хотите возвести в степень");
        double inputNumber = scanner.nextDouble();
        System.out.println("Введете степень, в которую ВЫ хотите возвести число");
        int degree = scanner.nextInt();
        double result = Math.pow(inputNumber, degree);
        System.out.println("Ваш резултат равен - "+result);
    }
}
