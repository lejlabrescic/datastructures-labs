package org.example.lab4;

public class Main {
    public static void main(String [] args) {
        int[] elements = {1,10,0,4,5,1,6,2,9,0,1};
        MergeSort.sort(elements);
        for(int i: elements) {
            System.out.println(i);
        }
    }

}
