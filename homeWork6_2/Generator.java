package homeWork6_2;

import homeWork6_2.Random.AnyRandom;
import homeWork6_2.allForAnimal.Animal;
import homeWork6_2.allForPerson.Person;

import java.util.Collection;
import java.util.Random;
import java.util.function.Supplier;

public class Generator {
    public static Person generatePerson(){
        int min = 5;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        int nickVariable = random.nextInt(diff + 1);
        nickVariable += min;
        int passwordVariable = random.nextInt(diff + 1);
        passwordVariable += min;
        return new Person(AnyRandom.nextString(nickVariable), AnyRandom.nextString(passwordVariable));
    }

    public static Animal generateIPhone(){
        int min = 5;
        int max = 10;
        int min1 = 1;
        int min2 = 15;
        int dif2 = min2 - min1;
        int diff = max - min;
        Random random = new Random();
        int nickVariable = random.nextInt(12);
        nickVariable += min;
        int ageVariable = random.nextInt(15);
        return new Animal(AnyRandom.nextString(nickVariable), ageVariable);
    }

    public static <T> void generator(Collection<T> container, Supplier<T> supplier, int count){
        for (int i = 0; i < count; i++) {
            container.add(supplier.get());
        }
    }
}
