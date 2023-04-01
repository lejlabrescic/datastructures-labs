package org.example.lab4;

import static org.example.lab3.AbstractSort.less;

public class RecursiveMergeSort {
    public static void sort(int[] elements) {
        int[] aux = new int [elements.length];
        sort(elements, aux, 0, elements.length-1);

    }
    private static void sort(int[] elements, int[] aux, int low, int high) {
        if(low >= high) { return ; }
        int mid = low + (high - low) / 2;
        sort(elements, aux, low, mid);
        sort(elements, aux, mid + 1, high);
        merge(elements, aux, low, mid, high);


    }
    private static void merge(int [] elements, int [] aux, int low, int mid, int high) {
        int k;
        for(k = low; k <= high; k++) {
            aux[k] = elements[k];
        }
        int i = low;
        int j = mid + 1;
        for(k = low; k <= high; k++) {
            if (i > mid) {
                elements[k] = aux[j++];
            }
            else if (j > high) {
                elements[k] = aux[i++];
            }
            else if (less(aux[j], aux[i])) {
                elements[k] = aux[j++];

            }
            else {
                elements[k] = aux[i++];
            }

        }
    }
}
