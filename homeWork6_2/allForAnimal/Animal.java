package homeWork6_2.allForAnimal;

import homeWork6_2.Random.AnyRandom;
import homeWork6_2.allForPerson.Person;

import java.util.*;

public class Animal {
    private String nick;
    private int age;

    public Animal(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nick='" + nick + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * Метод генериющий колекцию типа List
     * @param someCollection предполагаемая колекция
     * @return воврат преполагаемой колекции
     */
    public static String collectionMethodList(List<Animal> someCollection) {
        int min = 5;
        int max = 10;
        int min1 = 1;
        int min2 = 15;
        int dif2 = min2 - min1;
        int diff = max - min;
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int nickVariable = random.nextInt(12);
            nickVariable += min;
            int ageVariable = random.nextInt(15);
            //ageVariable += min2;
            someCollection.add(new Animal(AnyRandom.nextString(nickVariable), ageVariable));
        }
        return someCollection.toString();
    }

    /**
     * Метод генерирующий колекцию типа Set
     * @param someCollection предполагаемый список Set
     * @return возвращает готовую колекцию
     */
    public static String collectionMethodSet(Set<Animal> someCollection) {
        int min = 5;
        int max = 10;
        int diff = max - min;
        int min1 = 1;
        int min2 = 15;
        int dif2 = min2 - min1;
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int nickVariable = random.nextInt(diff + 1);
            nickVariable += min;
            int ageVariable = random.nextInt(dif2 + 1);
            ageVariable += min2;
            someCollection.add(new Animal(AnyRandom.nextString(nickVariable), ageVariable));
        }
        return someCollection.toString();
    }

    /**
     * @param someCollection колекция для ввода
     * @param count число элемнтов
     * @return готовая колекция
     */
    public static String collectionMethod(Collection<Animal> someCollection, int count) {
        int min = 5;
        int max = 10;
        int diff = max - min;
        int min1 = 1;
        int min2 = 15;
        int dif2 = min2 - min1;
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int nickVariable = random.nextInt(diff + 1);
            nickVariable += min;
            int ageVariable = random.nextInt(dif2 + 1);
            ageVariable += min2;
            someCollection.add(new Animal(AnyRandom.nextString(nickVariable), ageVariable));
        }
        return someCollection.toString();
    }
    /**
     * удаление колекции с помощью итератора
     * @param someCollection колекция на вход
     * @return возвращает пустую колекцию
     */
    public static String iteratorRemovePerson(Collection<Animal> someCollection){
        Iterator<Animal> iterator_remove_1 = someCollection.iterator();
        while (iterator_remove_1.hasNext()){
            Animal next = iterator_remove_1.next();
            iterator_remove_1.remove();
        }
        return someCollection.toString();
    }

    /**
     * удаление колекции с помощью for
     * @param someCollection колекция на вход
     * @return возвращает пустую колекцию
     */
    public static String forCollectionRemove(Collection<Animal> someCollection){
        int i = -1;
        for (Animal datum : someCollection) {
            i++;
            someCollection.remove(i);
        }
        return someCollection.toString();
    }

    /**
     * удаление колекции с помощью итератора
     * @param someCollection колекция на вход
     * @return возвращает пустую колекцию
     */
    public static String iteratorRemoveAnimal(Collection<Animal> someCollection){
        Iterator<Animal> iterator_remove_1 = someCollection.iterator();
        while (iterator_remove_1.hasNext()){
            Animal next = iterator_remove_1.next();
            iterator_remove_1.remove();
        }
        return someCollection.toString();
    }
}
