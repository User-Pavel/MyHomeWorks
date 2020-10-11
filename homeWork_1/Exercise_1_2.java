package homeWork_1;
//-42 = 11010110;
//-15 = 11110001;
public class Exercise_1_2 {
    public static void main(String[] args) {
        System.out.println(-42 | -15);
        System.out.println(-42 & -15);
        System.out.println(-42 ^ -15);
        System.out.println(~-42);
        System.out.println(~-15);
        System.out.println(-42 << 2);
        System.out.println(-15 << 2);
        System.out.println(-42 >> 2);
        System.out.println(-15 >> 2);
        System.out.println(-42 >>> 3);
    }
}
