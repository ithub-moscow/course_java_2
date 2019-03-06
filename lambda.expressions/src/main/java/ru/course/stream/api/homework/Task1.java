package ru.course.stream.api.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Task1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("sdfghjkl");
        list.add("sdfghjdfghj");
        list.add("kjhgfdoiuytr");
        list.add("wertyuiocvbfghjk");

        Comparator<String> cmp = (s1, s2) -> Integer.compare(s2.length(), s1.length());

        Collections.max(list, cmp);

        list.stream()
                .sorted(cmp)
                .findFirst();

        list.stream().max(cmp);

        BinaryOperator<String> func = (max, item) -> {
            if(max.length() > item.length())
                return max;
            else
                return item;
        };

        list.stream()
                .reduce((max, item) ->
                        max.length() < item.length() ? item : max);
    }
}
