package ru.course.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static ru.course.stream.api.Person.person;

public class Examples {

    public static void main(String[] args) {
        filterByLength();
        collectAsSet();
        collectAsMap();
        collectWithGrouping();
        infiniteStream();
    }

    static void filterByLength() {
        System.out.println("=== filterByLength ===");
        Stream.of("aaaaa", "bbbbbb", "ccccccccc", "dddddddddddd", "eeeeeeeeeeeeeee")
                .filter(str -> {
                    System.out.println("filter " + str);
                    return str.length() % 2 == 0;
                })
                .map(str -> {
                    System.out.println("map str");
                    return str.length();
                })
                .forEach(System.out::println);
    }

    static void collectAsSet() {
        System.out.println("=== collectAsSet ===");
        Stream.of(1,2,3,2,3,4,3,4,5)
                .collect(toSet())
                .forEach(System.out::println);

    }

    static void collectAsMap() {
        System.out.println("=== collectAsMap ===");
        Person[] persons = {
                person("AAA", "BBBB"),
                person("AAA", "CCCC"),
                person("BBB", "DDDDD")};

        Arrays.stream(persons)
                .collect(toMap(Person::getFirstName, p -> p))
                .forEach((key, person) ->
                        System.out.println(String.format("%s - %s", key, person)));
    }

    static void collectWithGrouping() {
        System.out.println("=== collectWithGrouping ===");

        Person[] persons = {
                person("AAA", "BBBB"),
                person("AAA", "CCCC"),
                person("BBB", "DDDDD")};

        Arrays.stream(persons)
                .collect(groupingBy(Person::getFirstName,
                        mapping(Person::getLastName,toList())))
                .forEach((key, person) ->
                        System.out.println(String.format("%s - %s", key, person)));
    }

    static void infiniteStream() {
        System.out.println("=== infiniteStream ===");
        Stream<Double> random = Stream.generate(Math::random);
        random
                .mapToDouble(Double::doubleValue)
                .map(d -> {
                    System.out.println("mapping " + d);
                    return d * 10;
                })
                .skip(20)
                .limit(10)
                .sorted()
                .forEach(System.out::println);
    }
}
