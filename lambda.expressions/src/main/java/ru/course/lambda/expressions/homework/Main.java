package ru.course.lambda.expressions.homework;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        Iterator<String> it = list.iterator();

        // Этот цикл должен вывести элементы по порядку 1 2 3 4
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // Метод разворачивает список в обратном порядке
        list.reverse();


        it = list.iterator();

        // Этот цикл должен вывести элементы по порядку 4 3 2 1
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
