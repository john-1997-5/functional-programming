package com.johnson.generics22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = List.of("johnson", "eden", "rosa");
        // e.g1: toma un string y devuelve un entero
        Function<String, Integer> function = s -> s.length();
        System.out.println(function.apply("johnson"));

        Map<String, Integer> sizes = convert(function, stringList);
        System.out.println(sizes);

        // e.g2: toma un string y devuelve otro string (T y R mismo tipo)
        Function<String, String> function1 = s -> s.substring(4,12);
        System.out.println(function1.apply("esternocleidomastoideo"));

        // e.g3 toma un entero y devuelve otro entero
        List<Integer> integers = List.of(1,2,3,4,5);
        Function<Integer,Integer> function2 = n -> n*n;
        Map<Integer,Integer> squaredIntegers = convert(function2, integers);
        System.out.println(squaredIntegers);
    }

    /**
     * Método que convertirá cada elemento T de la lista en un
     * elemento R y los pondrá en un map que tendrá:
     *  - key: el elemento original T
     *  - value: el elemento convertido R
     *
     * @param function
     * @param list
     * @return
     * @param <T>
     * @param <R>
     */
    private static <T,R> Map<T,R> convert(Function<T, R> function, List<T> list) {
        Map<T,R> sizes = new HashMap<>();
        for (T item: list) {
            sizes.put(item, function.apply(item));
        }
        return sizes;
    }

}
