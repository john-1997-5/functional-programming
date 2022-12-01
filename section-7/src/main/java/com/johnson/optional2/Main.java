package com.johnson.optional2;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Optional<String> originalOptional = Optional.of("hola");

        // map(): transforma un optional de un tipo en optional de otro tipo
        // map(Function<? super T, ? extends U> mapper)
        Function<String, Integer> function1 = String::length;
        UnaryOperator<String> function2 = s -> s.concat(" johnson");

        // transforma un optional de string en un optional de integer (Function)
        Optional<Integer> opt1 = originalOptional.map(function1);
        System.out.println(opt1.get());

        // transforma un optional de string en otro optional de string (UnaryOperator)
        Optional<String> opt2 = originalOptional.map(function2);
        System.out.println(opt2.get());

        // filter(): checkea la condición de un optional y devuelve optional del mismo tipo
        Optional<String> opt3 = originalOptional.filter(s -> s.equals("hola"));
        System.out.println(opt3.get());

        List<Optional<String>> optionalList = List.of(
                Optional.of("hola"),
                Optional.of("mundo"),
                Optional.of("java"));

        List<Optional<String>> optionalsWithA = new ArrayList<>();
        // filter optional strings who contain letter "a"
        for (Optional<String> opt : optionalList) {
            // si contiene devuelve optional con ese string y si no lo contiene devuelve optional vacío
            Optional<String> temp = opt.filter(s -> s.contains("a"));

            // aquí puedes ver que opts pasan el filtro
            System.out.println(opt.get() + " -> " + temp);

            if (temp.isPresent()) {
                optionalsWithA.add(temp);
            }
        }

        // print an optional list
        for (var opt : optionalsWithA) {
            System.out.println(opt.orElseThrow());
        }

        // flatMap
        //public <U> Optional<U> flatMap(Function<? super T, ? extends Optional<? extends U>> mapper) {
        Optional<Integer> optional = originalOptional.flatMap(s -> Optional.of(6));
        Optional<Integer> optional1 = originalOptional.map(s -> 6);

        Function<String, Integer> functionMap = String::length;
        /**
         * la función functionMap solo ha de preocuparse de devolver el tipo Integer tal cual
         * y con eso le basta
         */
        Optional<Integer> optionalMap = originalOptional.map(functionMap);

        Function<String, Optional<Integer>> functionFlatMap = s -> Optional.of(s.length());
        Optional<Integer> optionalFlatMap = originalOptional.flatMap(functionFlatMap);


    }
}
