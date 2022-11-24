package com.johnson.generics19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        /**
         * crear una lista de strings y eliminar aquellos strings vacíos
         */

        List<String> list = new ArrayList<>(Arrays.asList("johnson", "", "noelia", "", "martin", "", ""));
        // recibe un string y devuelve un booleano
        Predicate<String> stringPredicate = String::isEmpty; // s -> s.isEmpty()
        System.out.println("size before filtering: " + list.size() + " -> " + list);

        // old fashioned way
        List<String> listFiltered = filterList(list, stringPredicate);
        System.out.println("size after filtering: " + listFiltered.size() + " -> " + listFiltered);

        // new way
        list.removeIf(stringPredicate);
        System.out.println("size after filtering: " + list.size() + " -> " + list);

        /**
         * Crear lista de entero y eliminar los impares
         */

        // filtramos lista con enteros (podemos porque el método filterList() es genérico)
        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Predicate<Integer> integerPredicate = n -> n % 2 != 0; // par->even, impar->odd
        System.out.println("size before filtering: " + intList.size() + " -> " + intList);

        // old fashioned way
        List<Integer> oddList = filterList(intList, integerPredicate);
        System.out.println("size after filtering: " + oddList.size() + " -> " + oddList);

        // new way
        intList.removeIf(integerPredicate);
        System.out.println("size after filtering: " + intList.size() + " -> " + oddList);


    }

    /**
     * Método genérico que filtra un objeto uno por uno según el
     * predicate que se le pase
     *
     * @param list      lista a filtrar
     * @param predicate condición que debe cumplir cada objeto
     * @param <T>
     * @return lista filtrada
     */
    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> listFiltered = new ArrayList<>(list);

        for (T item : list) {
            if (predicate.test(item)) {
                listFiltered.remove(item);
            }
        }
        return listFiltered;
    }

}
