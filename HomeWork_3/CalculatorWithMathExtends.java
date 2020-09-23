package Functions;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    public double resultAbs(double numberAbs){
        return Math.abs(numberAbs);
    }

    public double numberSqrt(double numberSqrt){
        return Math.sqrt(numberSqrt);
    }

    public double resultPow(double numberPow1,double numberPow2){
        Math.pow(numberPow1,numberPow2);
        return numberPow1;
    }
}
