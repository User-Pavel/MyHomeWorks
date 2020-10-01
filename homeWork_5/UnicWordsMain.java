package homeWork_5;

import static homeWork_5.UnicWords.*;

public class UnicWordsMain extends BasisForWarAndPiece {


    public static void main(String[] args) {
        System.out.println(allUnicWords(readAllBytesJava7(filePath)));
        System.out.println(topWords(readAllBytesJava7(filePath)));
    }
}
