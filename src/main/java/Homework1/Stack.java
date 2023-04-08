package Homework1;
import Homework1.Queue.*;
public class Stack<Item> {
    private Queue<Item> q1;
    private Queue<Item> q2;

    public Stack() {
        q1 = new Queue<>();
        q2 = new Queue<>();
    }

    public void push(Item data) {
        q1.enqueue(data);
        while (!q2.isEmpty()) {
            q1.enqueue(q2.dequeue());
        }
        swap();
    }
    public Item peek() throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty.");
        }
        return q2.peek();
    }

    public Item pop() throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Cannot remove from an empty stack");
        }
        return q2.dequeue();
    }
    public int size() {
        return q2.size();
    }
    public boolean isEmpty() {
        return q2.isEmpty();
    }
    public void swap() {
        Queue<Item> temp = new Queue<>();
        temp = q1;
        q1 = q2;
        q2 = temp;

    }
}
