package com.johnson.generics20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,3,55,4,9,0);
        Consumer<Integer> integerConsumer = n -> System.out.println(n); // consume un entero y lo imprime
        printElements(integerList, integerConsumer);

        List<String> stringList = List.of("johnson", "eden", "rosa");
        Consumer<String> stringConsumer = System.out::println; // method reference signature
        printElements(stringList, stringConsumer);

    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for (T i : list) {
            consumer.accept(i);
        }
    }
}
