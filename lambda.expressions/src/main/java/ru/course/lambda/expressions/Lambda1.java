package ru.course.lambda.expressions;

import java.util.Comparator;

public class Lambda1 {
    private String field1;

    public static class Inner {
         public Inner(Lambda1 ex) {
             String d = ex.field1;
         }
    }
}
