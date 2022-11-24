package com.johnson.generics21;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // supplier que devuelve un string
        Supplier<String> supplier = () -> "hola johnson!";
        System.out.println(supplier.get());

        // supplier que devuelve un random
        Supplier<Number> numberSupplier = () -> Math.random();
        System.out.println(numberSupplier.get());

    }
}
