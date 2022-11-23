package com.johnson.gen186;

public class Main {
    public static void main(String[] args) {
        // nodos de enteros
        Node<Integer> nextIntNode = new Node<>(5, null);
        Node<Integer> currentIntNode = new Node<>(7, nextIntNode);
        System.out.println("Integer links -> " + currentIntNode);

        // nodos de Double
        Node<Double> nextDoubleNode = new Node<>(6.4, null);
        Node<Double> currentDoubleNode = new Node<>(2.1, nextDoubleNode );
        System.out.println("Double links -> " + currentDoubleNode);
        // linkeo con nodos de otros tipos
        currentDoubleNode.setNext(nextIntNode);
        System.out.println("Double w/ Integer links -> " + currentDoubleNode);

        // nodo de String
        Node<String> nextStringNode = new Node<>("hola", null);
        // currentDoubleNode.setNext(nextStringNode);
    }
}
