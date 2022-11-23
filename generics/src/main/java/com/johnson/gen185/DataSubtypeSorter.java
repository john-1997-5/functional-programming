package com.johnson.gen185;

import java.util.Arrays;
import java.util.List;

/**
 * Clase genérica que ordena valores de subtipos (subclases) de Number.
 * Long, Double, Float, Integer...
 *
 * @param <T>
 */
public class DataSubtypeSorter<T extends Number> {
    private List<T> myList;
    public DataSubtypeSorter(List<T> myList) {
        this.myList = myList;
    }

    public void sort(){
        myList.sort(null); // no comparator
        for (T item : myList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // String no es subtipo de Number así que no acepta este tipado
        //DataSubtypeSorter<String> strSorter = new DataSubtypeSorter<>(Arrays.asList("hola", "johnson", "bye"));
        DataSubtypeSorter<Integer> intSorter = new DataSubtypeSorter<>(Arrays.asList(3,4,7,1));
        DataSubtypeSorter<Double> doubleSorter = new DataSubtypeSorter<>(Arrays.asList(3.2,4.6,7.9,1.1));
        intSorter.sort();
        doubleSorter.sort();
    }
}