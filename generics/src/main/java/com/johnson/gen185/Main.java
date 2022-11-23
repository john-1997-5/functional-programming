package com.johnson.gen185;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        sortReverse(new ArrayList<>(Arrays.asList(6f, 8f, 1f, 17f)));
    }

    /**
     * Método genérico que ordena inversamente subtipos de Number
     * @param list
     * @param <T>
     */
    public static <T extends Number> void sortReverse(List<T> list) {
        list.sort(Collections.reverseOrder());
        for (T item : list) {
            System.out.println(item);
        }
    }

}
