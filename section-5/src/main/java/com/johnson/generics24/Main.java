package com.johnson.generics24;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // e.g1: type paremeters same as return parameter
        BiFunction<String, String, String> biFunction = (a, b) -> a.concat(" " + b);
        String concatenated = biFunction.apply("johnson", "arrobo");
        System.out.println(concatenated);

        // e.g2: type paremeters distinct of return parameter
        BiFunction<String, String, Integer> biFunction1 = (a,b) -> a.concat(b).length();
        Integer concatenatedSize = biFunction1.apply("johnson", "arrobo");
        System.out.println(concatenatedSize);
    }
}
