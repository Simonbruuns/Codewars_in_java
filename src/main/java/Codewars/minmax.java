package Codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class minmax {
    public static int[] minMax(int[] arr) {
        // Your awesome code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            if(i < min) min = i;
            if(i > max) max = i;
        }
        return new int[] {min, max};
    }
}
