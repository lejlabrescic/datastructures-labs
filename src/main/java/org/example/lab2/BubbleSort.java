package org.example.lab2;
import org.example.lab3.AbstractSort;
public class BubbleSort extends AbstractSort{
    public static void bubbleSorting(int[] arr) {
        {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j, j+1);
                    }
                }
            }
} } }
