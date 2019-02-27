package ru.course.lambda.expressions.homework;

import java.util.Iterator;

public class LinkedList<T> {
    private Item head;
    private Item last;

    private class Item {
        private T value;
        private Item next;

        Item(T value) {
            this.value = value;
        }
    }

    public void add(T value) {
        Item item = new Item(value);
        if(head == null) {
            head = item;
            last = item;
        } else {
            last.next = item;
            last = item;
        }
    }

    /* TODO Метод возвращает итератор для перебора элементов списка
            При реализации нужно воспользоваться вложенным или анонимным классом
     */
    public Iterator<T> iterator() {
        return null;
    }

    /*TODO Метод должен развернуть список в обратном порядке
           При реализации запрещено пользоваться стандартными классами библиотеки Java
           Не разрешается добавлять поля к классу Item и List
     */
    public void reverse() {

    }
}
