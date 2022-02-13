package com.czesak;

public class FoldAnArray {
    public static int[] foldArray(int[] array, int runs) {
        if (runs <= 0 || array.length == 1)
            return array;
        int i = 0;
        int j = array.length - 1;
        int[] helper = new int[(array.length+1)/2];
        while (i <= j) {
            helper[i] = array[i] + (i != j ? array[j] : 0);
            i++;
            j--;
        }
        return foldArray(helper, runs - 1);
    }
}
