package com.johnson.gen2;

public class Data<T> implements IData<T> {
    private T data;
    public Data(T data) {
        this.data = data;
    }

    @Override
    public T getData() {
        return this.data;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data is: " + this.data;
    }
}
