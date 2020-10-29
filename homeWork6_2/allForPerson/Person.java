package homeWork6_2.allForPerson;

import homeWork6_2.Random.AnyRandom;

import java.util.*;
import java.util.function.Supplier;

public class Person {
    private String nick;
    private String password;

    public Person(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }



    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password = " + password +
                '}';
    }

    /**
     * Метод генериющий колекцию типа List
     * @param someCollection предполагаемая колекция
     * @return воврат преполагаемой колекции
     */
    public static String collectionMethodList(List<Person> someCollection) {
        int min = 5;
        int max = 10;
        int diff = max - min;
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int nickVariable = random.nextInt(diff + 1);
            nickVariable += min;
            int passwordVariable = random.nextInt(diff + 1);
            passwordVariable += min;
            someCollection.add(new Person(AnyRandom.nextString(nickVariable), AnyRandom.nextString(passwordVariable)));
        }
        return someCollection.toString();
    }

    /**
     * Метод генерирующий колекцию типа Set
     * @param someCollection предполагаемый список Set
     * @return возвращает готовую колекцию
     */
    public static String collectionMethodSet(Set<Person> someCollection) {
        int min = 5;
        int max = 10;
        int diff = max - min;
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int nickVariable = random.nextInt(diff + 1);
            nickVariable += min;
            int passwordVariable = random.nextInt(diff + 1);
            passwordVariable += min;
            someCollection.add(new Person(AnyRandom.nextString(nickVariable), AnyRandom.nextString(passwordVariable)));
        }
        return someCollection.toString();
    }

    /**
     * @param someCollection колекция для ввода
     * @param count число элемнтов
     * @return готовая колекция
     */
    public static String collectionMethod(Collection<Person> someCollection, int count) {
        int min = 5;
        int max = 10;
        int diff = max - min;
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int nickVariable = random.nextInt(diff + 1);
            nickVariable += min;
            int passwordVariable = random.nextInt(diff + 1);
            passwordVariable += min;
            someCollection.add(new Person(AnyRandom.nextString(nickVariable), AnyRandom.nextString(passwordVariable)));
        }
        return someCollection.toString();
    }



    /**
     * удаление колекции с помощью for
     * @param someCollection колекция на вход
     * @return возвращает пустую колекцию
     */
    public static String forCollectionRemove(Collection<Person> someCollection){
        int i = -1;
        for (Person datum : someCollection) {
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
    public static String iteratorRemovePerson(Collection<Person> someCollection){
        Iterator<Person> iterator_remove_1 = someCollection.iterator();
        while (iterator_remove_1.hasNext()){
            Person next = iterator_remove_1.next();
            iterator_remove_1.remove();
        }
        return someCollection.toString();
    }
}

