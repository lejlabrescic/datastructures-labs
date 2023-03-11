package org.example;
/**
 * Stack implementation (using linked lists).
 *
 * @author Lejla Breščić
 */
public class Stack <Item> {
    private Node<Item> head = null;
    private int size = 0;

    public void pushData(Item data) {
        Node<Item> newNode = new Node<Item>();
        newNode.data = data;
        if(head == null ) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }
    public Item popData() {
        Item data;
        if (head == null) {
            throw new IndexOutOfBoundsException("We cannot pop from the empty stack");

        } else {
            data = head.data;
            head = head.next;
            size--;
            return data;
        }
    }
    public void printStack() {
        if (head == null) {
            System.out.println("Stack is empty");
        } else {
            Node<Item> current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }

        }
    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return this.size == 0;
    }

}
