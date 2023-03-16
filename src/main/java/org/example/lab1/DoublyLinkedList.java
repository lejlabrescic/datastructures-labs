package org.example.lab1;

public class DoublyLinkedList <Item>{
    private Node2<Item> head;
    Item data;
    public void addToFront(Item data) {
        Node2<Item> newNode = new Node2<>();
        newNode.data = data;
        if(head == null) {
            head = newNode;
            newNode.previous = null;

        }
        else {
            newNode.next = head;
            head = newNode;
            newNode.previous = null;
        }


    }
    public void removeFromFront() {
        if(head == null) {
            throw new IndexOutOfBoundsException("Cannot remove from an empty list");
        }
        else {
            head = head.next;
            head.previous = null;
        }
    }
    public void addToRear(Item data) {
        Node2<Item> newNode = new Node2<>();
        newNode.data = data;
        if (head == null) {
            head = newNode;
            newNode.previous = null;
        }
        else {
            Node2<Item> current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            current.next.previous = null;
        }
    }
    public void removeFromRear() {
        if(head == null) {
            throw new IndexOutOfBoundsException("Cannot remove from the empty stack");
        }
        else {
            Node2<Item> current = head;
            while(current.next.next != null) {
                current = current.next;
            }
            current.next = null;


        }
    }
    public void print() {
        Node2<Item> current = new Node2<>();
        current = head ;
        while(current!= null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
