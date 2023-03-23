package org.example.lab3;
import org.example.lab3.AbstractSort;
public class SelectionSort extends AbstractSort{
    public static void sort(int[] elements) {
        int i,j;
        for(i = 0; i<elements.length; i++) {
            int min = i;
            for(j = i + 1; j < elements.length; j++) {
                if(less(elements[j], elements[min]))
                    min = j;
            }
            swap(elements, i , min);

        }

    }
}
