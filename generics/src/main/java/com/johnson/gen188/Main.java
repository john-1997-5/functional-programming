package com.johnson.gen188;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer a = 5;
        Number b = 7;

        List<Integer> l1 = new ArrayList<>(); // correcto porque se sabe el tipo que se quiere
        l1.add(a);

        // restricciones
        List<?> l2 = new ArrayList<>(); //incorrecto
        //l2.add(b);
        //l2.add("hola");
        List<? extends Number> l3 = new ArrayList<Integer>();
        List<? extends Number> l4 = new ArrayList<Number>();
        //l3.add(a);
        //l4.add(b);
        
        // con el lower bound de Integer es posible añadir elementos a la lista pero solo con integers
        List<? super Integer> l5 = new ArrayList<Integer>();
        List<? super Integer> l6 = new ArrayList<Number>();
        l5.add(a);
        //l6.add(b);
    }
}
