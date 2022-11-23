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

        // nodos de Number
        Node<Number> nextNumberNode = new Node<>(55, null);
        Node<Number> currentNumberNode = new Node<>(10.4, nextNumberNode );
        System.out.println("Number links -> " + currentNumberNode);
        // linkeo con nodos de otros tipos
        currentNumberNode.setNext(nextIntNode);
        System.out.println("Number w/ Integer links -> " + currentNumberNode);
        currentNumberNode.setNext(nextDoubleNode);
        System.out.println("Number w/ Double links -> " + currentNumberNode);
        
    }
}
