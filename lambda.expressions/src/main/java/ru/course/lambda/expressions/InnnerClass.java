package ru.course.lambda.expressions;


import java.util.function.Function;

public class InnnerClass {
    private String field = "private zone";

    public static class Inner {
        {
//            System.out.println(field); // нет доступа, так как нет экземпляра внешнего класса
        }

        public Inner(InnnerClass outer) {
            System.out.println(outer.field);
        }

        public Inner() {
        }
    }

    Inner create() {
        return new Inner(this);
    }

    static Inner createStatic() {
        return new Inner();
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        Inner inner1 = new InnnerClass().create();
        Inner inner2 = InnnerClass.createStatic();

        Function<InnnerClass, Inner> f = Inner::new;
        f.apply(new InnnerClass());
    }
}
