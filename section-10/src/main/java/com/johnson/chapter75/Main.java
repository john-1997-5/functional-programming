package com.johnson.chapter75;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // algo que me imprima "hola johnson" 5 veces
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " hola johnson");
        }

        Stream.iterate(0, i -> i + 1)
                .limit(5)
                .forEach(i -> System.out.println(i + " hola johnson"));

        Stream.generate(() -> "hola johnson")
                .limit(5)
                .forEach(System.out::println);

        // flatMap
        Stream<String> boys = Stream.of("johnson", "mike");
        Stream<String> girls = Stream.of("lizzie", "scarlett");

        // quiero un stream de strings que contenga los 4 nombres
        Stream<Stream<String>> mixed1 = Stream.of(boys, girls); // no messirve
        Stream<String> mixed2 = Stream.of(boys, girls) // messirve
                .flatMap(e -> e); // identity function (takes an element and return same element)
        mixed2.collect(Collectors.toList()).forEach(System.out::println);
    }

}
