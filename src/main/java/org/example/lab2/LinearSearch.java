package org.example.lab2;

public class LinearSearch {
    public static int linearSearch(int[] elements, int key) {
        int i;
        for(i = 0; i<elements.length;i++) {
            if(elements[i] == key) {
                return i;
            }
        }
        return -1;
    }


}