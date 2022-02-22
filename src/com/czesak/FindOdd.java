package com.czesak;

public class FindOdd {
    /*
    Find integer in array that contains odd times
     */
    public static int findIt(int[] a) {
        int odd = 0;
        for (int j : a) {
            odd ^= j;
        }
        return odd;
    }
}
