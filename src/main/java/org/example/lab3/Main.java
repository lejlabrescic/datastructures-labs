package org.example.lab3;
import org.example.lab2.BubbleSort;
import org.example.lab3.SelectionSort;
import java.util.Arrays;
import org.example.lab2.BinarySearch;
public class Main {
    public static void main (String [] args) {
        int[] elements = {4,3,9,0,1,10,343,3};
        // InsertionSort.sort(elements);
        // ShellSort.sort(elements);
        // System.out.println(BinarySearch.binarySearching(elements, 10));
         int i;
        BubbleSort.bubbleSorting(elements);
        for(i = 0; i<elements.length;i++) {
            System.out.println(elements[i]);
        }

    }
}
