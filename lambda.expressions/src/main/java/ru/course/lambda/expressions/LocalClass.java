package ru.course.lambda.expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LocalClass {

    @FunctionalInterface
    interface Comparator2<T> {

        boolean greater(T o1, T o2);

        default boolean less(T o1, T o2) {
            return false;
        }
    }

    public static void main(String[] args) {
        localClass();
        anonymousClass();
        lambdaExpression();
        references();
    }

    static void references() {
        Comparator<String> cmpr = LocalClass::compare;
    }

    static int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }

    static void lambdaExpression() {
        Person[] array = new Person[10];

        Arrays.sort(array, (Person o1, Person o2) -> {
            // something
            return 0;
        });
    }

    static void anonymousClass() {

        Person[] array = new Person[10];

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };

        Person extenedPerson = new Person("2", "3") {
            @Override
            public String getFirstName() {
                return super.getFirstName() + "extended";
            }
        };

        Arrays.sort(array, comparator);
    }

    static void localClass() {
        Person[] array = new Person[10];

        class PersonCompare implements Comparator<Person> {

            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        }

        Arrays.sort(array, new PersonCompare());
    }
}
