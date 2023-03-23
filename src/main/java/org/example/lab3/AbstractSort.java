package org.example.lab3;

public abstract class AbstractSort {
    public static boolean less(int i, int j)  {
        return i < j;

    }
    public static void swap(int[] elements, int a, int b) {
        int temp = elements[a];
        elements[a] = elements[b];
        elements[b] = temp;
    }
}
