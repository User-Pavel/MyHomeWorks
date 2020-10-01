package homeWork_5;

import java.util.*;

public class SearchEngine  extends BasisForWarAndPiece implements Comparator{

    /**
     * 3. Написать интерфейс ISearchEngine.
     * @param text - текст в котором ищем
     * @param word - что ищем в тексте
     * @return - количество искомых слов в тексте
     */
    public static String text;
    public static String word;


    public static long search(String text, String word){
        List<String> data = new ArrayList<>();
        String[] oneWord;
        String delimiter = "\\s";
        oneWord = text.split(delimiter);
        for(int i = 0; i < oneWord.length; i++) {
            data.add(toStringFromChar(oneWord[i]));
        }
        long count = 0;
        for(int i =0; i < data.size(); i++){
            if(word.compareToIgnoreCase(data.get(i)) == 0){
                count++;
            }
        }
        return count;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
