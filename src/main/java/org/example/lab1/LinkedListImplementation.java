package org.example.lab1;

public class LinkedListImplementation {
    public static void main(String [] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.addToFront(5);
        li.addToFront(6);
        li.addToFront(5);
        li.addToRear(4);
        li.addToFront(2);
        li.removeFromFront();
        li.removeFromRear();
        li.print();
    }
}
