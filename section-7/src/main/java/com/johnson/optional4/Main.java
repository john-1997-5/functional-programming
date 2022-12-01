package com.johnson.optional4;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //resto de operadores más easy
        Optional<String> originalOptional = Optional.of("hola mundo");

        //.ifPresent(consumer): si el optional no está vacío pues hace algo (void operation)
        originalOptional.ifPresent(System.out::println); //hola mundo
        Optional.empty().ifPresent(System.out::println); // no imprime nada

        //.ifPresentOrElse(consumer, runnable): si el optional no está vacío ejecuta consumer y si lo está ejecuta runnable
        originalOptional.ifPresentOrElse(System.out::println, () -> System.out.println("no tiene nah!")); // hola mundo
        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("no tiene nah!")); // no tiene nah!

        //stream(): si el optional no está vacío devuelve un stream secuencial que contiene únicamente el valor contenido
        Stream<String> optionalStream = originalOptional.stream();
        optionalStream.forEach(System.out::println); // hola mundo

        Optional.empty().stream()
                .forEach(System.out::println); // no imprime nada

        /**
         * or(supplier): si el optional no está vacío devuelve ese optional y si lo está, devuelve un nuevo optional
         * la función lambda es parecida a la que requiere .flatMap() porque supplier supplies un Optional
         */
        originalOptional.or(() -> Optional.of("no tiene nah!")).ifPresent(System.out::println); // hola mundo
        Optional.empty().or(() -> Optional.of("no tiene nah!")).ifPresent(System.out::println); // no tiene nah!

        //equals(object): compara 2 Optionals, serán iguales si ambos tienen el mismo valor o si ambos son vacíos
        System.out.println(originalOptional.equals(Optional.of("hola mundo"))); // true
        System.out.println(Optional.empty().equals(Optional.empty())); // true
        System.out.println(originalOptional.equals(Optional.of("hello world"))); // false
        System.out.println(Optional.empty().equals(originalOptional)); // false

    }
}
