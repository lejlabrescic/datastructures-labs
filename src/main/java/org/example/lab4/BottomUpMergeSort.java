package org.example.lab4;

import org.example.lab3.AbstractSort;

public class BottomUpMergeSort extends AbstractSort {
    public static void sort(int[] elements) {
        int[] aux = new int[elements.length];
        int size;
        for(size = 1; size < elements.length; size *= 2) {
            for(int low = 0; low< elements.length - size; low += size * 2) {
                int mid = low + size - 1;
                int high = Math.min(low + 2 * size - 1, elements.length - 1);
                merge(elements, aux, low, mid, high);
            }

        }
    }
    public static void merge(int [] elements, int [] aux, int low, int mid, int high) {
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
