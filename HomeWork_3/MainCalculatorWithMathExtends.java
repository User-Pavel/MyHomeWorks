package Functions;
//4.1 + 15 * 7 + (28 / 5) ^ 2
public class MainCalculatorWithMathExtends implements ICalculatorWithMathExtends {
    public static void main(String[] args) {
        double calcResult1;
        calcResult1 = calculatorMathExtends.addition(calculatorMathExtends.addition(calculatorMathExtends.multiply(15,7),4.1),calculatorMathExtends.exponentiation(calculatorMathExtends.divide(28,5),2));
        System.out.println(calcResult1);
        System.out.println(calcResult1/0);
        System.out.println(calcResult1/0/0d);
    }
}
