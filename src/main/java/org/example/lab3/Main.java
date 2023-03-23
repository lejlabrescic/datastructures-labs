package org.example.lab3;

import java.util.Arrays;

public class Main {
    public static void main (String [] args) {
        int[] elements = {4,3,9,0,1,10,343,3};
        InsertionSort.sort(elements);
        int i;
        for(i = 0; i<elements.length;i++) {
            System.out.println(elements[i]);
        }
    }
}
