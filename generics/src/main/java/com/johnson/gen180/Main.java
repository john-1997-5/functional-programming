package com.johnson.gen180;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // se debe parametrizar para evitar classCastException
        List<String> names = new ArrayList<>(Arrays.asList("johnson", "rosa", "marta"));
        for (String name : names) {
            System.out.println(name);
        }

        // si no se parametriza no hay error a priori
        List rawNames = new ArrayList(Arrays.asList("martin", "johnny", 5, 7.23));

        // pero cuando intentas imprimir...
        for (Object obj : rawNames) {
            System.out.println((String) obj);
        }
    }
}
