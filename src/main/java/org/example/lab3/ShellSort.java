package org.example.lab3;
import org.example.lab3.*;
public class ShellSort extends AbstractSort{
    public static void sort(int[] elements){
        int h = 1;
        while(h < elements.length) {
            h = 3 * h + 1;
        }
        while(h >= 1) {
            for(int i = h; i< elements.length; i++) {
                for(int j = i; j >= h; j -= h ) {
                    if(less(elements[i], elements[j-h])){
                        swap(elements, j, j-h);

                    }
                    else {
                        break;
                    }
                }
            }
            h /= 3;
        }
    }
}
