package com.johnson.gen185;

import java.util.Arrays;
import java.util.List;

/**
 * Clase genérica que ordena valores de cualquier tipo
 * @param <T>
 */
public class DataSorter<T> {
    private List<T> myList;
    public DataSorter(List<T> myList) {
        this.myList = myList;
    }

    public void sort(){
        myList.sort(null); // no comparator
        for (T item : myList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        DataSorter<Integer> intSorter = new DataSorter<>(Arrays.asList(3,4,7,1));
        DataSorter<String> strSorter = new DataSorter<>(Arrays.asList("hola", "johnson", "bye"));
        intSorter.sort();
        strSorter.sort();
    }
}
