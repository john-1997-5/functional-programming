package com.johnson.generics18;

@FunctionalInterface
public interface FunctionalGenerics<T,R> {
    R execute(T t);
}
