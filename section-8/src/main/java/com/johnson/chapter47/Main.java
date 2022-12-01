package com.johnson.chapter47;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        /**
         * El Chaining se consigue cuando al resultado de una función
         * le aplicas otra función y ese resultado le puedes seguir aplicando
         * otra función hasta que te aburras.
         *
         * obj.performThis().andThenThis().andThenThis()...
         */

        MyConsumer<String> consumer1 = s -> System.out.println(s.concat(":)"));
        // imprime el string en mayúsculas
        MyConsumer<String> consumer2 = s -> System.out.println(s.toUpperCase());
        consumer1.accept("hola"); // hola
        consumer2.accept("mundo"); //MUNDO

        /**
         * Podrías pensar que creando un consumer que mezcle ambos consumers
         * se podría conseguir el Chaining, pero no, porque lo único
         * que haces es hacer lo mismo que cuando se hace por separado
         */
        MyConsumer<String> consumer3 = s -> {
            consumer1.accept(s);
            consumer2.accept(s);
        };

        // el resultado que se querría: HELLO:)
        consumer3.accept("hello");
        // el que se tiene:
        // hello:)
        // HELLO

        // algo así podría acercarse al chaining, más que nada por la nomenclatura
        MyConsumer<String> consumer4 = consumer1.thenAccept(consumer2);
        consumer4.accept("jake el perro");

        // Ejemplo con chaining de verdad
        Function<Integer, Integer> function1 = i -> i + 1; // puedes usar UnaryOperator bien visto
        Function<Integer, Integer> function2 = i -> i * i;

        Function<Integer, Integer> chainedFunction = function1.andThen(function2);
        System.out.println(chainedFunction.apply(5));

        /**
         * Chaining conseguido! La primera función da resultado 6 y sobre ese resultado
         * aplica la segunda función que lo eleva al cuadrado, por tanto,
         * la salida de una función es el input de la siguiente
         */

    }
}
