package homeWork6_2;

import homeWork6_2.allForAnimal.Animal;
import homeWork6_2.allForAnimal.SortedByAge;
import homeWork6_2.allForAnimal.SortedByTwoParametersAnimal;
import homeWork6_2.allForPerson.Person;
import homeWork6_2.allForPerson.SortedByTwoParameters;

import java.util.*;

import static homeWork6_2.allForAnimal.Animal.*;
import static homeWork6_2.allForAnimal.SortedByAge.sortedListByAgeAnimal;
import static homeWork6_2.allForAnimal.SortedByTwoParametersAnimal.sortedListByTwoParametersAnimal;
import static homeWork6_2.allForPerson.SortedByPasswordLength.sortedListByPasswordLength;
import static homeWork6_2.allForPerson.SortedByTwoParameters.sortedListByTwoParameters;


public class AnimalCollectionMain1 {
    public static void main(String[] args) {
        List<Animal> basisList = new ArrayList<>();
        Set<Animal> basisSet = new HashSet<>();

        collectionMethod(basisList, 5);
        collectionMethod(basisSet, 5);

        List<Animal> linkedList = new LinkedList<>(basisList);
        List<Animal> arrayList = new ArrayList<>(basisList);
        //Set<Animal> hashSet = new HashSet<>(basisSet);
        //Set<Person> treeSet = new TreeSet();

        System.out.println("Сортировка linkedList по дмум параметрам " + sortedListByTwoParametersAnimal(linkedList) + "\n");
        System.out.println("Сортировка linkedList по длине пароля " + sortedListByAgeAnimal(linkedList) + "\n");

        System.out.println("Сортировка arrayList по двум параметрам " + sortedListByTwoParametersAnimal(arrayList) + "\n");
        System.out.println("Сортировка arrayList по возрасту " + sortedListByAgeAnimal(arrayList) + "\n");

        arrayList.sort(new SortedByAge());
        //System.out.println(arrayList);

        arrayList.sort(new SortedByTwoParametersAnimal());
        //System.out.println(arrayList);


        linkedList.sort(new SortedByAge());
        //System.out.println(linkedList);

        linkedList.sort(new SortedByTwoParametersAnimal());
        //System.out.println(linkedList);

        linkedList.sort(new SortedByTwoParametersAnimal());

        System.out.println("Итерирование linkedList");
        Iterator<Animal> iterator_1 = linkedList.iterator();
        while (iterator_1.hasNext()){
            System.out.println(iterator_1.next());
        }

        System.out.println("Перебор linkedList for");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(basisList.get(i));
        }

        arrayList.sort(new SortedByTwoParametersAnimal());

        System.out.println("Итерирование arrayList");
        Iterator<Animal> iterator_2 = arrayList.iterator();
        while (iterator_2.hasNext()){
            System.out.println(iterator_2.next());
        }

        System.out.println("Перебор arrayList for");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(basisList.get(i));
        }

        System.out.println(forCollectionRemove(arrayList));
        System.out.println(forCollectionRemove(linkedList));
        
        System.out.println(iteratorRemoveAnimal(arrayList));
        System.out.println(iteratorRemoveAnimal(linkedList));
    }
}
