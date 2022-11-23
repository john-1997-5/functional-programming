package com.johnson.gen184;

public class PrinterClass {
    /**
     * <T> este token es obligatorio para indicarle al compilador que es un método genérico.
     * Se coloca antes del tipo de retorno
     */

    // void method
    public <T> void print1(T toPrint) {
        System.out.println("printing... " + toPrint);
    }

    // return method with generic parameter
    public <T> String print2(T toPrint) {
        return "printing this instead... " + toPrint;
    }

    // return method with generic parameter & generic return
    public <T> T print3(T toPrint) {
        return toPrint;
    }

    // void con 2 parémetros genéricos
    public <K,T> void print4(K value1, T value2, boolean flag) {
        System.out.println("printing... " + (flag ? value1 : value2));
    }
}
