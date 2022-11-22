package com.johnson.fun3;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {
        // imperative
        int sumOfEvens = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sumOfEvens += i;
            }
        }
        System.out.println("Sumatorio total de pares (imperative way): " + sumOfEvens);

        // declarative
        sumOfEvens = IntStream.range(0,100)
                .filter(i -> i % 2 == 0)
                .reduce((x, y) -> x + y)
                .getAsInt();
        System.out.println("Sumatorio total de pares (declarative way): " + sumOfEvens);
    }
}
