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
    }
}
