package com.johnson.gen184;

public class Main {
    public static void main(String[] args) {
        PrinterClass printerClass = new PrinterClass();
        printerClass.print1(5);
        printerClass.print1("johnson");
        printerClass.print1(3.4);

        System.out.println(printerClass.print2(4f));
        System.out.println("printing this one... " + printerClass.print3(5));

        printerClass.print4("johnson", "3.5", false);
    }
}
