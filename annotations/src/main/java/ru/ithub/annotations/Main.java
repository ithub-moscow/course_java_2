package ru.ithub.annotations;

public class Main {

    class Inner {

    }

    public static void main(String[] args) {
        ClassWithData data = new ClassWithData();
        data.setValue1(12);
        System.out.println(data.getValue1());
    }
}
