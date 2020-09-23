package HomeWork_2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_2_Exercise_4_BubbleSort_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Тестовые массивы
         */
        int[] array_1 = {1,2,3,4,5,6};
        int[] array_2 = {1,1,1,1};
        int[] array_3 = {9,1,5,99,9,9};
        int[] array_4 = {};

        bubbleSort(array_1);
        bubbleSort(array_2);
        bubbleSort(array_3);
        bubbleSort(array_4);

        /**
         * Рандомный массив
         */
        int arrayCount = ((int) (Math.random()*100));
        int[] array_5 = new int[arrayCount];
        for (int i = 0; i < array_5.length; i++) {
            array_5[i] = ((int) (Math.random()*100));
        }
        bubbleSort(array_5);

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
        bubbleSort(array_6);
    }

    /**
     * Bubble Sort for every massive
     * @param array
     */
    public static void bubbleSort(int[] array){
        System.out.print(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] < array[j]){
                    int number = array[i];
                    array[i]=array[j];
                    array[j] = number;
                }
            }

        }
        System.out.println("->" +Arrays.toString(array));
    }

}
