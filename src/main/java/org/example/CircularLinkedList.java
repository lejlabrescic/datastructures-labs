package org.example;
public class CircularLinkedList<Item> {
    Node2<Item> head;
    Item data;
    public void addToRear(Item data) {
        Node2<Item> newNode = new Node2<>();
        newNode.data = data;
        if(head == null) {
            head = newNode;

        }
        else {
        Node2<Item> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        head.previous = newNode;

    }}
    public void print() {
        Node2<Item> current = new Node2<>();
        current = head ;
        while(current!= null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
