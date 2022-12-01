package com.johnson.chapter47;

import java.util.function.Consumer;

@FunctionalInterface
public interface MyConsumer<T> extends Consumer<T> {
    default MyConsumer<T> thenAccept(MyConsumer<T> next) {
        return (T t) -> {
            this.accept(t);
            next.accept(t);
        };
    }
}

