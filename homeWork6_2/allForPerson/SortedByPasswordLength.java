package homeWork6_2.allForPerson;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SortedByPasswordLength implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int password1Length = o1.getPassword().length();
        int password2Length = o2.getPassword().length();
        if(password1Length > password2Length){
            return 1;
        } else if(password1Length < password2Length){
            return -1;
        } else{
            return 0;
        }
    }
    /**
     * Сортиррвка List по длине пароля
     * @param someCollection спсиок на вход
     * @return отсартированный список на выход
     */
    public static String sortedListByPasswordLength(List<Person> someCollection){
        someCollection.sort(new SortedByPasswordLength());
        return someCollection.toString() + "\n" +
                "Операция: сортировка массива по длине пароля. Заняла "+ System.currentTimeMillis()+ " мс";
    }

}
