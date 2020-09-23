package Functions;

public class TestClassT {
    public static void main(String[] args) {
        System.out.println(Qvadrat(100));
        System.out.println(Qvadrat2(100));

    }
    public static double Qvadrat(double a){
        double b = 0;
        while(b * b != a || b  * b == a){
            if(b * b == a){
                return b;
            }
            else if(b * b < a){
              b = b + 0.000000001;
            }
            else if(b * b > a){
                return b;
            }
        }
        return 0;
    }


    public static double Qvadrat2(double a){
        double b = 0;
        while(b * b != a || b  * b == a){
            if(b * b == a){
                return b;
            }
            else if(b * b < a){
              b = b + 0.1;
            }
            else if(b * b > a){
                break;
            }
        }
        b = b - 0.1;
        while(b * b != a || b  * b == a){
            if(b * b == a){
                return b;
            }
            else if(b * b < a){
                b = b + 0.0000000001;
            }
            else if(b * b > a){
                return b;
            }
        }
        return 0;
    }
}
