package homeWork6_2.allForPerson;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SortedByTwoParameters implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int password1Length = o1.getPassword().length();
        int password2Length = o2.getPassword().length();

        String name1 = o1.getNick();
        String name2 = o2.getNick();

        if(password1Length > password2Length){
            return 1 + name1.compareToIgnoreCase(name2);
        } else if(password1Length < password2Length){
            return -1 + name1.compareToIgnoreCase(name2);
        } else{
            return 0;
        }
    }
    /**
     * Методсортирующий колекцию List по двум параметрам
     * @param someCollection список на вход
     * @return отсортированный список на выход
     */
    public static String sortedListByTwoParameters(List<Person> someCollection){
        someCollection.sort(new SortedByTwoParameters());
        return someCollection.toString() + "\n" +
                "Операция: сортировка массива по двум парамметрам. Заняла "+ System.currentTimeMillis()+ " мс";
    }

}

