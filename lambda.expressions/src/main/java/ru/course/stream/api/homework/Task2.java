package ru.course.stream.api.homework;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task2 {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {2,3,4}, {3,4,5}};

        // a
        Stream.of(matrix)
                .flatMapToInt(IntStream::of)
                .sorted()
                .forEach(System.out::println);

        // b
        matrix = Stream.of(matrix)
                .peek(Arrays::sort)
//                .map(ar -> IntStream.of(ar).sorted().toArray())
                .toArray((n) -> new int[n][n]);

        System.out.println(Arrays.deepToString(matrix));
    }
}
