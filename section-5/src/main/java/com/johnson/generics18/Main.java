package com.johnson.generics18;

public class Main {
    public static void main(String[] args) {
        // recibe un String y devuelve un Integer
        FunctionalGenerics<String, Integer> func = s -> s.length();
        System.out.println(func.execute("hola"));

        // recibe y devuelve un String
        FunctionalGenerics<String,String> func1 = s -> s.substring(1,5);
        System.out.println(func1.execute("johnson"));
    }
}
