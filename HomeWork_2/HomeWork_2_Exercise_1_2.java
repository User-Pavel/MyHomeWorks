package HomeWork_2;

import java.util.ArrayList;
import java.util.List;

class HomeWork_2_Exercise_1_2 {
    public static void main(String[] args) {
        number(-111);
    }

    public static void number(int x){
        if(x == 0){
            System.out.println(0);
        }
        else {
            List<Integer> newNumber = new ArrayList<>();
            while (x != 0) {
                newNumber.add(x % 10);
                x /= 10;
            }
            int result = 1;
            for (int i = 0; i < newNumber.size(); i++) {
                if (i == newNumber.size() - 1) {
                    result = newNumber.get(i) * result;
                    System.out.print(newNumber.get(i));

                } else {
                    result = newNumber.get(i) * result;
                    System.out.print(newNumber.get(i) + "*");
                }
            }
            System.out.print("=" + result);
        }
    }

}
