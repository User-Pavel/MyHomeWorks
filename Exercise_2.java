package HomeWork_1;

public class Exercise_2 {
    public static void main(String[] args) {
        int a = 2;
        a++;
        int b = 8;
        b = --b;
        int five = 5;
        int two = 2;
        int eight = 8;
        int seven = 7;
        int twentyTwo = 22;
        int sixtyEight = 68;
        int twenty = 20;
        int six = 6;
        int three = 3;
        int twelve = 12;
        int oneHundredNineTeen = 119;
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(five + two / eight); //=5; деление приорететнее сложения
        System.out.println((five + two) / eight); //=0; скобки выполняются в первую очередь
        System.out.println((five + a) / eight);//=1; вначале выполняется 5+2, затем 7+1, а потом деление
        System.out.println((five + a) / b);//=1; вначале вычесляется b, затем a, потом скобки и в конце деление
        System.out.println((five * two >> a) / b);//=0; вначале сдвиг, потои умножение в скобках и в  коцне деление
        System.out.println((five + seven > twenty ? sixtyEight : twentyTwo * two >> a) / b);//=0
        System.out.println(six - two > three && twelve * twelve <= oneHundredNineTeen);//=false
        System.out.println(isTrue && isFalse);//при операторе И, между true и false результат всегда false

    }
}
