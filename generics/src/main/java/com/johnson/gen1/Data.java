package com.johnson.gen1;

/**
 * T es un placeholder que acepta cualquier tipo
 */
public class Data<T> {
    private T data;
    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data is: " + getData();
    }
}
