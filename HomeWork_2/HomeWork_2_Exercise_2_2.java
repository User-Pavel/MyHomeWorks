package HomeWork_2;

import java.util.Scanner;

public class HomeWork_2_Exercise_2_2 {
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
        for (int i = 0; i < number; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
