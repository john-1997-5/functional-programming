package com.johnson.gen1;

public class Data {
    private Object data;
    public Data(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "data is: " + getData();
    }
}
