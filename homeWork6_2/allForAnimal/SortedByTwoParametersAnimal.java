package homeWork6_2.allForAnimal;

import homeWork6_2.allForPerson.Person;
import homeWork6_2.allForPerson.SortedByTwoParameters;

import java.util.Comparator;
import java.util.List;

public class SortedByTwoParametersAnimal implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();

        String name1 = o1.getNick();
        String name2 = o2.getNick();

        if(age1 > age2){
            return 1+ name1.compareToIgnoreCase(name2);
        } else if(age1 < age2){
            return -1+ name1.compareToIgnoreCase(name2);
        } else{
            return 0;
        }
    }
    /**
     * Методсортирующий колекцию List по двум параметрам
     * @param someCollection список на вход
     * @return отсортированный список на выход
     */
    public static String sortedListByTwoParametersAnimal(List<Animal> someCollection){
        someCollection.sort(new SortedByTwoParametersAnimal());
        return someCollection.toString() + "\n" +
                "Операция: сортировка массива по двум парамметрам. Заняла "+ System.currentTimeMillis()+ " мс";
    }
}
