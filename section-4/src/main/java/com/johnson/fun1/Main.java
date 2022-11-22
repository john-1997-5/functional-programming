package com.johnson.fun1;

public class Main {
    public static void main(String[] args) {
        // lambda sin parámetros y sin tipo de retorno
        Name name = () -> System.out.println("Johnson");
        name.myName();

        // lambda con parámetros y sin tipo de retorno
        MathOperation suma = (a, b) -> System.out.println(a + b);
        MathOperation multiply = (a, b) -> System.out.println(a * b);
        suma.calculate(5, 7);
        multiply.calculate(6, 3);

        //lambda con parámetro y tipo de retorno
        LengthOfString lengthLambda = s -> s.length(); // con una línea sobra el return
        String str = "hi Johnny!";
        System.out.println("length of: " + str + " -> " + lengthLambda.length(str));

        // lambda con múltiples statements
        lengthLambda = s -> {
            int len = s.length();
            System.out.println("length of: " + s + " -> " + len);
            return len; // con varias líneas es necesario el return
        };
        lengthLambda.length("hi Johnson Arrobo!");

    }
}
