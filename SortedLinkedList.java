package com.bridgelabz.LinkedList;

public class SortedLinkedList<T extends Comparable<T>> extends LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void append(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null) {
            head = newNode;
        } else {
            tail.next= newNode;
        }
        tail = newNode;
        sortList();
    }

    public void sortList(){
        Node<T> current = head, index;
        T temp;

        if(head != null) {
            while(current != null){
                index = current.next;
                while (index != null){
                    if((current.data.compareTo(index.data))>0){
                        temp= current.data;
                        current.data= index.data;
                        index.data= temp;
                    }
                    index= index.next;
                }
                current= current.next;
            }
        }
    }

    @Override
    public void show() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
