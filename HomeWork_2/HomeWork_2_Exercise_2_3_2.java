package HomeWork_2;


import java.util.Scanner;

public class HomeWork_2_Exercise_2_3_2 {
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
        int j = number;
        while (j >= 0){
            System.out.println(String.valueOf(arr[j-1]));
            j--;
        }
    }
}
