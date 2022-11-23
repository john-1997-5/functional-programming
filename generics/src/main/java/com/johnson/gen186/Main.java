package com.johnson.gen186;

public class Main {
    public static void main(String[] args) {
        // nodos de enteros
        Node<Integer> nextIntNode = new Node<>(5, null);
        Node<Integer> currentIntNode = new Node<>(7, nextIntNode);
        System.out.println(currentIntNode);

        // nodos de Double
        Node<Double> nextDoubleNode = new Node<>(6.4, null);
        Node<Double> currentDoubleNode = new Node<>(2.1, nextDoubleNode );
        System.out.println(currentDoubleNode);

        // nodos de Number
        Node<Number> nextNumberNode = new Node<>(55, null);
        Node<Number> currentNumberNode = new Node<>(10.4, nextNumberNode );
        System.out.println(currentNumberNode);

        //currentNumberNode.setNext(nextIntNode);
        //currentNumberNode.setNext(nextDoubleNode);
        // Node<Integer> no es subtipo de Node<Number> aunque Integer sí es subtipo de Number

    }
}
