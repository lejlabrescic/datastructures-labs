package org.example;

import java.sql.SQLOutput;

public class LinkedList <Item> {
    private Node<Item> head;
    Item data;
    public void addToFront(Item data) {
        Node<Item> newNode = new Node<>();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    public void print() {
         Node<Item> current = new Node<>();
         current = head ;
         while(current!= null) {
             System.out.println(current.data);
             current = current.next;
         }


    }
    public void addToRear(Item data) {
        Node<Item> newNode = new Node<>();
        newNode.data = data;
        if(head == null) {
            head = newNode;

        }
        else {
        Node<Item> current = new Node<>();
        current = head;
        while(current.next != null) {
            current = current.next;

        }
        current.next = newNode;

    }}
    public void removeFromFront() {
        if(head == null) {
            throw new IndexOutOfBoundsException("Cannot remove from the empty stack");
        }

            head = head.next;

    }
    public void removeFromRear() {
        if(head == null) {
            throw new IndexOutOfBoundsException("Cannot remove from the empty stack");
        }
        {
            Node<Item> current = head;
            while(current.next.next != null) {
                current = current.next;
            }
            current.next = null;

        }

    }
}
