package com.johnson.gen178;

public class Main {
    public static void main(String[] args) {
        IData<String> data = new Data<>("hola mundo con interfaz genérica");
        System.out.println(data.getData());
    }
}
