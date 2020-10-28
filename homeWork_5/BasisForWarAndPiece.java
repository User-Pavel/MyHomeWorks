package homeWork_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class BasisForWarAndPiece {
    //Read file content into string with - Files.readAllBytes(Path path)
    public static String filePath = ("Война и мир_книга.txt");

    static String readAllBytesJava7(String filePath)
    {
    String content = "";

    try
    {
    content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
    }
        catch (IOException e)
        {e.printStackTrace();}
        return content;
    }

    private static char[] illegalChars = {'!','.','?',',','-','"',')','(',';',':'};


    public static char illegalSymbol1 = '!';
    public static char illegalSymbol2 = '.';
    public static char illegalSymbol3 = '?';
    public static char illegalSymbol4 = ',';
    public static char illegalSymbol5 = '-';
    public static char illegalSymbol6 = '"';
    public static char illegalSymbol7 = ')';
    public static char illegalSymbol8 = '(';
    public static char illegalSymbol9 = ';';
    public static char illegalSymbol10 = ':';

    /**
     * метод, удаляющий все ненужные символы из элементов массива
     * @param oneElement
     * @return
     */
    public static String toStringFromChar(String oneElement){
        StringBuilder stringBuilder = new StringBuilder();
        char[] toChar = oneElement.toCharArray();
        for (int i = 0; i < toChar.length; i++) {
            if(Objects.equals(toChar[i], illegalSymbol1) ||
                    Objects.equals(toChar[i], illegalSymbol2) ||
                    Objects.equals(toChar[i], illegalSymbol3) ||
                    Objects.equals(toChar[i], illegalSymbol4) ||
                    Objects.equals(toChar[i], illegalSymbol5) ||
                    Objects.equals(toChar[i], illegalSymbol6) ||
                    Objects.equals(toChar[i], illegalSymbol7) ||
                    Objects.equals(toChar[i], illegalSymbol8) ||
                    Objects.equals(toChar[i], illegalSymbol9) ||
                    Objects.equals(toChar[i], illegalSymbol10)) {
                continue;
            }
            else {stringBuilder.append(toChar[i]);}
        }
        return stringBuilder.toString();
    }
    /**
     * Исправиление по комментарию
     * метод, удаляющий все ненужные символы из элементов массива
     * @param oneElement
     * @return
     */
    public static String toStringFromCharNewVariant(String oneElement){
        StringBuilder stringBuilder = new StringBuilder();
        char[] toChar = oneElement.toCharArray();
        for (int i = 0; i < toChar.length; i++) {
            for (int j = 0; j < illegalChars.length; j++) {
                if (Objects.equals(toChar[i], illegalChars[j])) {
                    continue;
                } else {
                    stringBuilder.append(toChar[i]);
                }
            }
        }
        return stringBuilder.toString();
    }


}