package Functions;
//написать this, исправить конструкторы, исправаить Copy, проверить работу Countetera
//memory Long and memory Short
public class CalculatorWithCounter {
    private int countOperation;
    private double calcCopyResult;
    private double calcOperationResult;
    private double calcMathResult;

    public int getCountOperation() {
        return countOperation;
    }

    public void setCountOperation(int countOperation) {
        this.countOperation = countOperation;
    }

    private CalculatorWithMathCopy calcCopy = new CalculatorWithMathCopy();

    private CalculatorWithOperator calcOperator = new CalculatorWithOperator();

    private CalculatorWithMathExtends calcMath = new CalculatorWithMathExtends();


    public double addition(double a, double b){
        this.countOperation++;
        return a+b; }

    public double subtraction(double a, double b){
        this.countOperation++;
        return a-b; }

    public double multiply(double a, double b){
        this.countOperation++;
        return a*b; }

    public double divide(double a, double b){
        this.countOperation++;
        return a/b; }

    public double resultAbs(double numberAbs){
        this.countOperation++;
        return Math.abs(numberAbs); }

    public double numberSqrt(double numberSqrt){
        this.countOperation++;
        return Math.sqrt(numberSqrt); }

    public double resultPow(double numberPow1,double numberPow2){
        this.countOperation++;
        return Math.pow(numberPow1,numberPow2);
    }
}
