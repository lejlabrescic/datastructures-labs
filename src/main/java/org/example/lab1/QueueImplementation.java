package org.example.lab1;

public class QueueImplementation {
    public static void main(String [] args){
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(13);
        q.dequeue();
        q.dequeue();
        q.print();


    }
}
