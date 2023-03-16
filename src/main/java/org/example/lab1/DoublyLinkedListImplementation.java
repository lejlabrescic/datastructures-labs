package org.example.lab1;

public class DoublyLinkedListImplementation {
    public static void main(String [] args) {
        DoublyLinkedList<Integer> ll = new DoublyLinkedList<>();
        ll.addToFront(4);
        ll.addToFront(45);
        ll.addToFront(5);
        ll.removeFromFront();
        ll.addToRear(4);
        ll.addToRear(10);
        ll.removeFromRear();
        ll.print();
    }
}
