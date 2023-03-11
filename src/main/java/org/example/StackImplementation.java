package org.example;
/**
 * Stack implementation (using linked lists).
 * @author Lejla B.
 */
public class StackImplementation {
    public static void main(String [] args) {
        Stack<Integer> si = new Stack<>();
        si.pushData(4);
        si.pushData(3);
        System.out.println(si.popData());
        System.out.println(si.size());

    }
}