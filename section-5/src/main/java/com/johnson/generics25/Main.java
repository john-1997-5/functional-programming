package com.johnson.generics25;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        // e.g1: type paremeters same as return parameter
        //BiFunction<String, String, String> function = (a, b) -> a.concat(" " + b);
        BinaryOperator<String> function = (a, b) -> a.concat(" " + b);
        String concatenated = function.apply("johnson", "arrobo");
        System.out.println(concatenated);

    }
}
