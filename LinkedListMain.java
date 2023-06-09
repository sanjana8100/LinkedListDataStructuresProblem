package com.bridgelabz.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1= new LinkedList<>();

        //PUSH METHOD
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);

        linkedList1.show();

        LinkedList<Integer> linkedList2= new LinkedList<>();

        //ADD OR APPEND METHOD
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);

        linkedList2.show();

        //POP METHOD
        Integer pop1= linkedList2.pop();
        if(pop1==null)
            System.out.println("Linked List Is Empty");
        else
            System.out.println("The Element Popped is: "+pop1);
        linkedList2.show();

        //POP LAST METHOD
        linkedList2.push(56);

        Integer pop2= linkedList2.popLast();
        if(pop2==null)
            System.out.println("Linked List Is Empty");
        else
            System.out.println("The Element Popped is: "+pop2);
        linkedList2.show();

        //SEARCH METHOD
        Node<Integer> searchedData = linkedList2.search(30);
        if(searchedData == null)
            System.out.println("Element not found!");
        else
            System.out.println("Element Found");

        //INSERT AFTER METHOD
        linkedList2.append(70);

        boolean isInserted= linkedList2.insertAfter(30, 40);
        if(isInserted)
            System.out.println("Element Inserted Successfully");
        else
            System.out.println("Element is not Inserted");
        linkedList2.show();

        //DELETE METHOD
        boolean isDeleted= linkedList2.delete(40);
        if(isDeleted)
            System.out.println("Element Deleted Successfully");
        else
            System.out.println("Element is not Deleted");
        linkedList2.show();
        linkedList2.Size();

        //SORTED ARRAY CLASS
        SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();
        sortedList.append(56);
        sortedList.append(30);
        sortedList.append(40);
        sortedList.append(70);

        System.out.println("Sorted Linked List:");
        sortedList.show();
    }
}
