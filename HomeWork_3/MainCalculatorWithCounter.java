package Functions;
//4.1 + 15 * 7 + (28 / 5) ^ 2
public class MainCalculatorWithCounter implements ICalculatorWithCounter {
    public static void main(String[] args) {
        double calcResult;
        double calcResult2;
        double calcResult3;
        double calcResult4;
        calcResult = calculatorWithCounter.addition(4.1,calculatorWithCounter.addition(calculatorWithCounter.multiply(15,7),(calculatorWithCounter.resultPow(calculatorWithCounter.divide(28,5),2))));
        System.out.println(calcResult);
        System.out.println(calculatorWithCounter.getCountOperation());
        System.out.println(calcResult/0);
        System.out.println(calcResult/0.0d);

    }
}
