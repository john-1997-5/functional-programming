package com.johnson.gen186;

public class Node<T> {
    private T data;
    // lower bounded wildcard
    // parameters of type or supertype of Integer
    private Node<? super Integer> next;

    public Node(T data, Node<? super Integer> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<? super Integer> getNext() {
        return next;
    }

    public void setNext(Node<? super Integer> next) {
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
