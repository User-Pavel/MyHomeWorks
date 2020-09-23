package Functions;

public class CalculatorWithOperator {
    public double addition(double a, double b){
        double result = a + b; return result;
    }

    public double subtraction(double a, double b){
        double result = a - b; return result;
    }

    public double multiply(double a, double b){
        double result = a * b; return result;

    }

    public double divide(double a, double b){
        double result = a / b; return result;
    }

    /**
     * метод возвращает резултат возведения числа a в определенную сетпень b
     * @param a число, которое необходимо возвести в определенную степень
     * @param b степень, в которую требуется возвести число
     * @return
     */
    public double exponentiation(double a, int b) {
        if (b == 0) {
            a = 1;
            return a;
        } else {
            int counter = 1;
            while (counter != b) {
                a = a * a;
                counter += 1;
            }
            double result = a;
            return result;
        }
    }

    /**
     * метод возвращает модуль числа
     * @param a чилсо, модуль которого необходимо вернуть
     * @return возвращает результ
     */
    public double module(double a){
        if(a==0){
            return 0;
        }
        else if(a<0){
            return a*(-1);
        }
        else if(a>0){
            return a;
        }
        return 0;
    }

    /**
     * возвращает квадратный корень из числа, метод длинный и некрасивый по коду, но гораздо быстрее первого
     * варианта(в 5 раз), точность озвращаемого результата = 0.999999999999738
     * оба метода находятся в классе "TestClassT", можно посмотреть для сравнения
     * @param a чилсо, квадратный корень из которого надо найти
     * @return возвращает квадратный корень из числа a
     */
    public static double squareRoot(double a){
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
                b = b + 0.000000001;
            }
            else if(b * b > a){
                return b;
            }
        }
        return 0;
    }
}
