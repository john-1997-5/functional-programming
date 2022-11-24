package com.johnson.generics29;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Function<Runnable, Thread> function = runnable -> new Thread(runnable);
        Function<Runnable, Thread> function = Thread::new; // constructor reference signature
        Runnable runnable = () -> System.out.println("ejecutado hilo1");

        // hilo1
        Thread thread = function.apply(runnable);
        thread.start();

        // hilo2 in a functional way
        function
                .apply(() -> System.out.println("ejecutado hilo2"))
                .start();
    }
}
