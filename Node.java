package com.bridgelabz.LinkedList;

public class Node<T extends Comparable<T>> {
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
    }
}
