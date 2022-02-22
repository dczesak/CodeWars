package com.czesak;

public class FindOdd {
    public static int findIt(int[] a) {
        int odd = 0;
        for (int j : a) {
            odd ^= j;
        }
        return odd;
    }
}
