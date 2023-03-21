package com.bridgelabz.LinkedList;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head=newNode;
        } else {
            tail.next=newNode;
        }
        tail=newNode;
    }

    public void show() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public T pop() {
        if(head == null)
            return null;
        T popData = head.data;
        head = head.next;
        return popData;
    }

    public T popLast(){
        if(head == null)
            return null;
        T popData = tail.data;
        if(head == tail){
            head= null;
            return popData;
        }
        Node<T> temp= head;
        while(temp.next != tail)
            temp= temp.next;
        temp.next=null;
        tail= temp;
        return popData;
    }
}
