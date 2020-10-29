package homeWork6_2.allForAnimal;

import java.util.Comparator;
import java.util.List;

public class SortedByAge implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int age1 = o1.getAge();
        int age2 = o2.getAge();
        if(age1 > age2){
            return 1;
        } else if(age1 < age2){
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
    public static String sortedListByAgeAnimal(List<Animal> someCollection){
        someCollection.sort(new SortedByAge());
        return someCollection.toString() + "\n" +
                "Операция: сортировка массива по длине пароля. Заняла "+ System.currentTimeMillis()+ " мс";
    }

}
