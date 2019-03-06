package ru.course.stream.api.homework;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task3 {

    static Integer idx = 0;


    public static void main(String[] args) {
        final int N = 10;

        IntStream.range(1, N).reduce((r, i) -> r * i);

        Stream.iterate(1, i -> i + 1)
                .limit(N)
                .reduce((r, i) -> r * i);

        Stream.iterate(1, i-> i < N, i -> i + 1)
                .reduce((r, i) -> r * i);

//        AtomicInteger index = new AtomicInteger(1);
//        Stream.generate(index::incrementAndGet)
        Stream.generate(() -> idx++)
                .limit(N)
                .reduce((r, i) -> r * i);
    }
}
