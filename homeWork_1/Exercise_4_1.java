package homeWork_1;

public class Exercise_4_1 {
    public static void main(String[] args) {
        sleepIn(true,false);
    }
    static boolean sleepIn(boolean isWeekday, boolean isVacation) {
        if (isVacation == true || isWeekday == false) {
            System.out.println("Можно спать");
            return true;
        } else {
            System.out.println("Надо на работу");
            return false;
        }

// boolean result = sleepIn(...)е
    }
}