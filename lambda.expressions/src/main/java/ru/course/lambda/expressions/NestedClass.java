package ru.course.lambda.expressions;

public class NestedClass {

    private String field = "private zone";

    class Nested {

        {
            System.out.println(field);
        }
    }

    Nested create() {
        return new Nested();
    }

    static Nested createStatic() {
//        return new Nested(); // Ошибочный код, так как нет экземпляра внешнего класса
        return null;
    }

    public static void main(String[] args) {
//        Nested nested = new Nested(); // Ошибочный код, так как нет экземпляра внешнего класса
        Nested nested = new NestedClass().new Nested();
        Nested nested1 = new NestedClass().create();
    }
}
