package com.bridgelabz.LinkedList;

public class LinkedList<T extends Comparable<T>> {
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

    public Node<T> search(T searchData){
        Node<T> temp= head;
        while(temp!=null){
            if((temp.data).equals(searchData))
                return temp;
            temp= temp.next;
        }
        return null;
    }

    public boolean insertAfter(T searchData, T insertData) {
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            return true;
        }
        return false;
    }

    public boolean delete(T data){
        Node<T> searchedNode = search(data);

        if(searchedNode!=null){
            Node<T> temp = head;
            while(temp.next != searchedNode)
                temp= temp.next;
            temp.next= searchedNode.next;
            searchedNode.next= null;
            return true;
        }
        return false;
    }

    public void Size() {
        Node<T> temp = head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        System.out.println("Size of the linked list is "+count);
    }
}
