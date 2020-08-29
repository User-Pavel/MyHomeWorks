package HomeWork_1;
//42 = 00101010
//15 = 00001111
public class Exercise_1 {
    public static void main(String[] args) {
        System.out.println(42|15); //00101111
        System.out.println(42&15); //00001010
        System.out.println(42^15); //00100101
        System.out.println(~42); //11010101
        System.out.println(~15); //11110000
        System.out.println(42<<2); //10101000
        System.out.println(15<<2); //00001010
        System.out.println(42>>2); //00001010
        System.out.println(15>>2); //00000011
        System.out.println(42>>>3); //00000101
    }
}
