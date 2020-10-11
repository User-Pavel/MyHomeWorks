package homeWork_1;
import java.util.Scanner;
public class Exercise_6 {
    static void createPhoneNumber() {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[10];
        String result = "";
        System.out.println("Заполните 10 цифрами Массив");
        for (int i=0; i<10; i++){
            numbers[i] = scanner.nextInt();
            if (i == 0)
                result += '(';
            else if (i == 3)
                result += ") ";
            else if (i == 6)
                result += '-';

            result += numbers[i];
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
            createPhoneNumber();
    }
}
