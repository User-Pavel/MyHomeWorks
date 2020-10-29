package homeWork6_2;

import homeWork6_2.allForAnimal.Animal;
import homeWork6_2.allForPerson.Person;
import homeWork6_2.allForPerson.SortedByTwoParameters;


import java.util.*;

import static homeWork6_2.allForPerson.Person.*;
import static homeWork6_2.allForPerson.SortedByPasswordLength.sortedListByPasswordLength;
import static homeWork6_2.allForPerson.SortedByTwoParameters.sortedListByTwoParameters;

public class PersonCollection1 {
    public static void main(String[] args) {
        List<Person> basisList = new ArrayList<>();
        Set<Person> basisSet = new HashSet<>();
        Collection<Person> data1 = new ArrayList<>();

        collectionMethodList(basisList);
        collectionMethodSet(basisSet);


        List<Person> linkedList = new LinkedList<>(basisList);
        List<Person> arrayList = new ArrayList<>(basisList);
        //Set<Person> hashSet = new HashSet<>(basisSet);
        //Set<Person> treeSet = new TreeSet();

        System.out.println("Сортировка linkedList по дмум параметрам " + sortedListByTwoParameters(linkedList) + "\n");
        System.out.println("Сортировка linkedList по длине пароля " +sortedListByPasswordLength(linkedList) + "\n");


        System.out.println("Сортировка arrayList по двум параметрам " + sortedListByTwoParameters(arrayList) + "\n");
        System.out.println("Сортировка arrayList по возрасту " + sortedListByPasswordLength(arrayList) + "\n");

        //System.out.println(hashSet);
        linkedList.sort(new SortedByTwoParameters());

        System.out.println("Итерирование linkedList");
        Iterator<Person> iterator_1 = linkedList.iterator();
        while (iterator_1.hasNext()){
            System.out.println(iterator_1.next());
        }

        System.out.println("Перебор linkedList for");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(basisList.get(i));
        }

        arrayList.sort(new SortedByTwoParameters());

        System.out.println("Итерирование arrayList");
        Iterator<Person> iterator_2 = arrayList.iterator();
        while (iterator_2.hasNext()){
            System.out.println(iterator_2.next());
        }

        System.out.println("Перебор arrayList for");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(basisList.get(i));
        }


        System.out.println("Пустая коллекция arrayList "+ "\n" +iteratorRemovePerson(arrayList)+ "\n");
        System.out.println("Пустая коллекция linkedList "+ "\n" +iteratorRemovePerson(linkedList)+ "\n");

        System.out.println("Пустая коллекция linkedList через for "+ "\n" +forCollectionRemove(linkedList)+ "\n");
        System.out.println("Пустая коллекция linkedList через for "+ "\n" +forCollectionRemove(linkedList)+ "\n");


    }

}
