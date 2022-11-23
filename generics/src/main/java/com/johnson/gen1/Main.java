package com.johnson.gen1;

public class Main {
    public static void main(String[] args) {

        // funciona correctamente con tipo String
        Data dataString = new Data("hola mundo!");
        System.out.println(dataString + "\nof type:" + dataString.getData().getClass());

        // funciona correctamente con cualquier tipo de datos
        Data dataInt = new Data(5);
        System.out.println(dataInt + "\nof type:" + dataInt.getData().getClass());

        // intento downcast del atributo data (tipo Object) de dataString a tipo entero
        int valor = (int) dataString.getData(); // error aunque el compiler no detecta nada
    }
}
