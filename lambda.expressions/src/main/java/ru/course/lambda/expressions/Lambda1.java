package ru.course.lambda.expressions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Lambda1 {
    private String field1;

    public static class Inner {
         public Inner(Lambda1 ex) {
             String d = ex.field1;
         }

    }

    public static void main(String[] args) throws IOException {


    }
}
