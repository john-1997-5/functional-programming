package com.johnson.chapter68;

import com.johnson.chapter64.Book;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1. filter

        List<Integer> pares = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(".filter() -> " + pares);
        // 2. map
        //UnaryOperator<Integer> function = i -> i * i;
        List<Integer> cuadrados = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println(".map() -> " + cuadrados);

        List<Book> books = Arrays.asList(
                new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797),
                new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10),
                new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67),
                new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908)
        );
        // mapeamos esa lista de Book a una lista de String porque solo queremos el nombre del autor
        books.stream()
                .map(book -> book.getAuthor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // 3. reduce (mirar chapter 70)


        Integer sumatorio = Stream.of(3, 7, 2, 10)
                .reduce(0, (a, b) -> a + b);

        System.out.println(".reduce() -> " + sumatorio);


    }
}
