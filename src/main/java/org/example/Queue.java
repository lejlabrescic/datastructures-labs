package org.example;

public class Queue <Item>{
    Node<Item> head;
    Item data;
    private int size = 0;
    public void enqueue(Item data) {
        Node<Item> newNode = new Node<>();
        newNode.data = data;
        if(head == null) {
            head = newNode;
        }
        else {
        Node<Item> current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }
        size++;
    }
    public Item dequeue() {
        if(head == null) {
            throw new IndexOutOfBoundsException("Cannot dequeue an empty queue");
        }
        else {
           head = head.next;
           size--;
           return data;

        }


    }
    public void print() {
        Node<Item> current = new Node<>();
        current = head ;
        while(current!= null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }
}
