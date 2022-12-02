package com.johnson.chapter64;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook", "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail", "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves", "Mark Z. Danielewski", "Horror", 4.10908908));
        /**
         * give the popular horror book (a book is  popular if his rating is > 3)
         */
        List<Book> popularHorrorBooks = new ArrayList<>();
        // imperative way
        for (Book book : books) {
            if (book.getGenre().equals("Horror") && book.getRating() > 3) {
                popularHorrorBooks.add(book);
            }
        }

        popularHorrorBooks.forEach(System.out::println);

        // functional way
        // stream for popular horror books
        books.stream() // source
                .filter(book -> book.getGenre().equals("Horror"))// intermediate operation
                .filter(book -> book.getRating() > 3)// intermediate operation
                .collect(Collectors.toList()) // terminal operation
                .forEach(System.out::println);

        // stream for popular romantic books
        books.stream()
                .filter(book -> book.getGenre().equals("Romance"))
                .filter(book -> book.getRating() > 3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // stream for popular books
        Stream<Book> popularBooksStream = books.stream()
                .filter(book -> book.getRating() > 3)
                .peek(book -> System.out.println("Filtered Book: " + book));

        System.out.println("Filtered done!");
        printStream(popularBooksStream);
    }

    public static <T> void printStream(Stream<T> stream) {
        List<T> collect = stream.collect(Collectors.toList());
        System.out.println("Collection done!");
        collect.forEach(System.out::println);

    }
}
