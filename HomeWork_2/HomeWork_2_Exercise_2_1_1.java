package HomeWork_2;

import java.util.Scanner;

public class HomeWork_2_Exercise_2_1_1 {
    public static void main(String[] args) {
       array();

    }

    private static void array() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элемнтов массива");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Введите массив");
            arr[i] = scanner.nextInt();
        }
        int i = 0;
        do{
            System.out.println(arr[i]);
            i++;
        } while(i < number-1);
            System.out.println(arr[i]);
            i++;
    }
}
