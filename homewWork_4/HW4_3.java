package homewWork_4;

import java.util.Scanner;

public class HW4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней");
        int days = scanner.nextInt();
        int weeks = days/7;
        if(weeks>=11 && weeks <=14){
            System.out.println(weeks + " недель");
        }
        else if(weeks%10>=2 && weeks%10<=4){
            System.out.println(weeks +" недели");
        }
        else if(weeks%10==1){
            System.out.println(weeks + " неделя");
        }
        else if(weeks%10>=5 && weeks%10<=9){
            System.out.println(weeks+ " недель");
        }
        else if(weeks%10==0){
            System.out.println(weeks + " недель");
        }
    }
}
