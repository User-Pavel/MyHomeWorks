package Functions;
//4.1 + 15 * 7 + (28 / 5) ^ 2
public class MainCalculatorWithOperator implements ICalculatorWithOperator {
    private static double calcResult;
    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        calcResult = calculatorWithOperator.addition(4.1,calculatorWithOperator.addition(calculatorWithOperator.multiply(15,7),(calculatorWithOperator.exponentiation(calc.divide(28,5),2))));
        System.out.println(calcResult);
        System.out.println(calcResult/0);
        System.out.println(calcResult/0.0d);
    }

}
