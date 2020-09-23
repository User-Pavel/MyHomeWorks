package HomeWork_2;

import java.util.Arrays;

public class HomeWork_2_Exercise_1_1 {
    public static void main(String[] args) {

        oneToFive(0);
    }

    /**
     *
     * @param argument - array size
     */
    public static void oneToFive(int argument){
        if(argument == 0){
            System.out.println("Массив пуст");
        }
        else {
            int sum = 0;
            int[] array = new int[argument];
            for(int i = 0; i <= argument-1; i++){
                array[i]= i + 1;
                sum = sum + 1 + i;
            }
            System.out.println(Arrays.toString(array));
            System.out.println(sum);
        }
    }
}
