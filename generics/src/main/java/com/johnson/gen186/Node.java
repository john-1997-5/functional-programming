package com.johnson.gen186;

public class Node<T> {
    private T data;
    // upper bounded wildcard
    private Node<? extends Number> next;

    public Node(T data, Node<? extends Number> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<? extends Number> getNext() {
        return next;
    }

    public void setNext(Node<? extends Number> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
