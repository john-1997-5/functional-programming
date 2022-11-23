package com.johnson.gen186;

public class Main {
    public static void main(String[] args) {
        // Number es supertipo de Integer
        // nodos de enteros
        Node<Integer> nextIntNode = new Node<>(5, null);
        Node<Integer> currentIntNode = new Node<>(7, nextIntNode);
        System.out.println("Integer links -> " + currentIntNode);

        // nodos de Number
        Node<Number> nextNumberNode = new Node<>(55, null);
        Node<Number> currentNumberNode = new Node<>(10.4, nextNumberNode);
        System.out.println("Number links -> " + currentNumberNode);

        // link number to int node
        currentNumberNode.setNext(nextIntNode);
        System.out.println("Number to Integer link -> " + currentNumberNode);

        // link int to number node
        currentIntNode.setNext(nextNumberNode);
        System.out.println("Integer to Number link -> " + currentIntNode);

        // nodos de Double
        Node<Double> nextDoubleNode = new Node<>(6.4, null);
        //currentNumberNode.setNext(nextDoubleNode);
    }
}
