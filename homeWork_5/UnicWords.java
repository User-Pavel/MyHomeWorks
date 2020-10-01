package homeWork_5;

import java.util.*;

public class UnicWords extends BasisForWarAndPiece {
    /**
     * 2.1 Найти в строке все уникальные слова и поместить их в коллекцию используя Set.
     * @param text
     * @return
     */
    public static String allUnicWords(String text) {
        Set<String> someWords = new TreeSet<>();
        String[] oneWord;
        String delimiter = "\\s";
        oneWord = text.split(delimiter);
        for(int i = 0; i < oneWord.length; i++) {
            someWords.add(toStringFromChar(oneWord[i]));
        }
        return someWords.toString();
    }



    /**
     * Задание 2.2 - Найти в строке топ 10 слов и вывести количество этих слов используя Map.
     * @param text
     * @return
     */
    public static String topWords(String text){
        Map<Integer, String> allWordsMap = new TreeMap<>();
        List<String> someWords = new LinkedList<>();
        String[] oneWord;
        String delimiter = "\\s";
        oneWord = text.split(delimiter);
        for(int i = 0; i < oneWord.length; i++) {
            someWords.add(toStringFromChar(oneWord[i]));
        }
        for (int i = 0; i < someWords.size(); i++) {
            int count = 0;
            for (int j = 0; j < someWords.size(); j++) {
                if(someWords.get(i).equals(someWords.get(j))) {
                    count += 1;
                }
            }
            allWordsMap.put(count,someWords.get(i));
        }

        String result = "";
        int countOfIteration = 0;
        for(int i = allWordsMap.size(); countOfIteration < 10; i--){
            String halfResult;
            if(allWordsMap.get(i) == null){continue;}
            if(i == allWordsMap.size()){
                if((i%10 == 2 || i%10 == 3 || i%10 == 4)&& i%100!=12 && i%100!=13 && i%100!=14){
                halfResult = allWordsMap.get(i) +  " - " + i + " раза";}
                else{halfResult = allWordsMap.get(i) +  " - " + i + " раз";}
                countOfIteration+=1;}
            else{
                if ((i%10 == 2 || i%10 == 3 || i%10 == 4) && i%100!=12 && i%100!=13 && i%100!=14){
                    halfResult = "\n" + allWordsMap.get(i) + " - " + i + " раза";}
                else{halfResult = "\n" + allWordsMap.get(i) +  " - " + i + " раз";}
                countOfIteration+=1;}
            result += halfResult;
        }
        return result;
    }


}

