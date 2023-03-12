package org.example;

public class CircularLinkedListImplementation {
    public static void main(String [] args) {
        CircularLinkedList<Integer> dll = new CircularLinkedList<>();
        dll.addToRear(4);
        dll.addToRear(3);
        dll.addToRear(5);
        dll.print();
    }
}
