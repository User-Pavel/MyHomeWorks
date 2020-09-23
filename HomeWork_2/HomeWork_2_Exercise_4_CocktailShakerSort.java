package HomeWork_2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_2_Exercise_4_CocktailShakerSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Тестовые массивы
         */
        int[] array_1 = {1,2,3,4,5,6};
        int[] array_2 = {1,1,1,1};
        int[] array_3 = {9,1,5,99,9,9};
        int[] array_4 = {};

        shakerSort(array_1);
        shakerSort(array_2);
        shakerSort(array_3);
        shakerSort(array_4);

        /**
         * Рандомный массив
         */
        int arrayCount = ((int) (Math.random()*100));
        int[] array_5 = new int[arrayCount];
        for (int i = 0; i < array_5.length; i++) {
            array_5[i] = ((int) (Math.random()*100));
        }
        shakerSort(array_5);

        /**
         * Массив от пользователя
         */
        System.out.println("Введите предполагаемую длину массива");
        int array_6_length = scanner.nextInt();
        int[] array_6 = new int[array_6_length];
        System.out.println("Введите числа для заполнения массива");
        for (int i = 0; i < array_6_length; i++) {
            array_6[i] = scanner.nextInt();
        }
        shakerSort(array_6);

    }

    /**
     * Shaker sort for every Massive
     * @param array
     */
    public static void shakerSort(int array[]) {
        System.out.print(Arrays.toString(array));
        int a;
        int b = 0;
        int c = array.length - 1;
        do {
            for (int i = b; i < c; i++) {
                if (array[i] > array[i + 1]) {
                    a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
            c--;
            for (int i =c; i > b; i--) {
                if (array[i] < array[i - 1]) {
                    a = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = a;
                }
            }
            b++;
        } while (b < c);
        System.out.println("->" +Arrays.toString(array));
    }
}
