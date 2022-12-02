package com.johnson.chapter72;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797),
                new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10),
                new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67),
                new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908)
        );

        // dame la media de los ratings
        // podemos usar average(), pero es un método único de los streams numéricos
        books.stream()
                .mapToDouble(book -> book.getRating())// transformamos a stream numérico
                .average()// devuelve optional
                .ifPresent(System.out::println);


        IntStream intStream = IntStream.of(3, 7, 2, 10);
        Stream<Integer> boxed = intStream.boxed(); // ya no cuenta con métodos exclusivos

    }
}
