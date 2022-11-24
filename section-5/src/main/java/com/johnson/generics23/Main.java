package com.johnson.generics23;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // e.g2: toma un string y devuelve otro string (T y R mismo tipo)
        //Function<String, String> function1 = s -> s.substring(4,12);
        UnaryOperator<String> function1 = s -> s.substring(4, 12);
        System.out.println(function1.apply("esternocleidomastoideo"));

        // e.g3 toma un entero y devuelve otro entero
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        //Function<Integer,Integer> function2 = n -> n*n;
        UnaryOperator<Integer> function2 = n -> n * n;
        Map<Integer, Integer> squaredIntegers = convert(function2, integers);
        System.out.println(squaredIntegers);
    }

    /**
     * Método que convertirá cada elemento T de la lista en un
     * elemento R y los pondrá en un map que tendrá:
     * - key: el elemento original T
     * - value: el elemento convertido R
     *
     * @param function
     * @param list
     * @param <T>
     * @param <R>
     * @return
     */
    private static <T, R> Map<T, R> convert(Function<T, R> function, List<T> list) {
        Map<T, R> sizes = new HashMap<>();
        for (T item : list) {
            sizes.put(item, function.apply(item)); // se usa mismo método apply() porque extiendo de Function
        }
        return sizes;
    }

}
