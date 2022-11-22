package com.johnson.fun2;

public class Main {
    public static void main(String[] args) {

        // y = f(x), es decir, function as a value
        JohnsonInterface myInterface = () -> System.out.println("hi, this is Johnson!");
        myInterface.sayHi();

        // paso una función como argumento
        sayHiAgain(() -> System.out.println("hi again, this is Johnson!")); //también podría pasarle myInterface

    }

    public static void sayHiAgain(JohnsonInterface johnsonInterface) {
        johnsonInterface.sayHi();
    }
}
