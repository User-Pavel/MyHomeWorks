package homeWork6_2.Random;

import java.util.Random;

public class AnyIntRandom {
    private static final char[] allLetters = ("1234567890").toCharArray();
    private static final Random random = new Random();

    public static String nextString(int length) {
        StringBuilder builder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            builder.append(allLetters[random.nextInt(allLetters.length)]);
        }
        return builder.toString();
    }
}
