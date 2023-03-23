package org.example.lab2;

public class Algorithms {
    public static void swap(int[] elements, int a, int b) {
        int temp = elements[a];
        elements[a] = elements[b];
        temp = elements[b];
    }
    public static void sort(int [] elements) {
        int swapped = 0;
        for(int i = 0; i<elements.length; i++ ) {
            swapped = 0;
            for(int j = 1; j<elements.length-1;j++) {
                if(elements[j-1]>elements[j]) {
                    swap(elements,j-1,j);
                }


            }
        }
    }
}
//bubble sort
