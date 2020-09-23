package HomeWork_2;

import java.util.Scanner;

public class HomeWork_2_Exercise_1_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число с которо начнется таблица умножения");
        int start = scanner.nextInt();
        System.out.println("Введите конечное число");
        int number = scanner.nextInt();//число до которого будут умножать
        for (;start <= number; start++) {
            for (int j = 2; j <= number/2; j++) {
                System.out.printf("    %d * %d = %d ", j, start, start * j);
                if (j == number/2) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        for (;start <= number; start++) {
           for (int j = number/2+1; j <= number; j++) {
               System.out.printf("     %d * %d = %d ",start, j, start * j);
               if(j == number){
                   System.out.println();
               }
           }
       }
    }
}

