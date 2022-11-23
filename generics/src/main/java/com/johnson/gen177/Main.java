package com.johnson.gen177;

public class Main {
    public static void main(String[] args) {

        // funciona correctamente con tipo String
        Data<String> dataString = new Data<>("hola mundo genérico!");
        System.out.println(dataString + "\nof type:" + dataString.getData().getClass());

        // funciona correctamente con cualquier tipo de datos
        Data<Integer> dataInt = new Data<>(5);
        System.out.println(dataInt + "\nof type:" + dataInt.getData().getClass());

        // intento downcast del atributo data (tipo T) de dataString a tipo entero
        //int valor = (int) dataString.getData(); // el compilador ya detecta el error
    }
}
