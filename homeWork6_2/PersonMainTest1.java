package homeWork6_2;


import homeWork6_2.allForPerson.SortedByPasswordLength;
import homeWork6_2.allForPerson.SortedByTwoParameters;

import homeWork6_2.allForPerson.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonMainTest1 {
    public static void main(String[] args) {
        List<Person> arrayList = new ArrayList<>();
        arrayList.add(new Person("Pavel", "jlksdab"));
        arrayList.add(new Person("Mike", "sfbds"));
        arrayList.add(new Person("Ira", "bddfd"));
        arrayList.add(new Person("Pavel", "sdfbdesbn"));
        arrayList.add(new Person("Mike", "sbdfdbddbdfb"));

        arrayList.sort(new SortedByPasswordLength());
        System.out.println("\n___ Sorted by PasswordLength");
        for (Person person : arrayList)
            System.out.println(person.toString());

        arrayList.sort(new SortedByTwoParameters());
        System.out.println("\n___ Sorted by PasswordLength");
        for (Person person : arrayList)
            System.out.println(person.toString());
    }
}
