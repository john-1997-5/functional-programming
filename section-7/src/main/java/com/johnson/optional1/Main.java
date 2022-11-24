package com.johnson.optional1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String str = "hola";

        // .of() no admite nulos
        Optional<String> ofOptional = Optional.of(str);
        //Optional<String> ofOptional1 = Optional.of(null); throws nullPointer cuando ejecutamos

        // .empty() crear empty optional
        Optional<String> emptyOptional = Optional.empty();

        // .ofNullable() admite nulos
        Optional<String> optional4 = Optional.ofNullable(str);
        Optional<String> optional5 = Optional.ofNullable(null); // no lanza nullPointer

        /**
         * get values back from Optional
         */

        // 1. get() method

        String valueFromOptional;

        valueFromOptional = ofOptional.get(); // sabemos que este optional devolverá algo
        System.out.println(valueFromOptional);
        /**
         * get() es un método peligroso, ya que en el caso en que ese Optional esté vacío nos
         * saltará una NoSuchElementException
         */
        //valueFromOptional = emptyOptional.get(); // c mamo

        // 2. get() + (isPresent() || isEmpty) -> esta combinación nos permite curarnos en salud
        valueFromOptional = emptyOptional.isPresent() ? emptyOptional.get() : "adios";
        System.out.println(valueFromOptional);
        // 3. mejor opción usando orElse() o orElseGet()
        // orElse() -> el valor por defecto siempre se crea pero solo se usa cuando el Optional está vacío
        valueFromOptional = emptyOptional.orElse("adios");
        System.out.println(valueFromOptional);
        // orElseGet() -> solo ejecutar el supplier para obtener el valor por defecto solo si el Optional está vacío
        // si no está vacío devuelve el valor sin crear el supplier
        valueFromOptional = emptyOptional.orElseGet(() -> "adios");
        System.out.println(valueFromOptional);

        // 4. orElseThrow() sin o con argumento en caso de que no se quiera devolver nada cuando está vacío y se quiera lanzar excepción directamente
        // orElseThrow() sin argumento lanza NoSuchElementException por defecto si no encuentra nada (igual que el get() pero usar este approach mejor)
        valueFromOptional = emptyOptional.orElseThrow();
        // orElseThrow() con argumento (recibe un supplier) lanza la excepción que se quiera
        valueFromOptional = emptyOptional.orElseThrow(IllegalArgumentException::new);



    }
}
