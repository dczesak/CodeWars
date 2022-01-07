package com.czesak;

import java.util.Arrays;

public class SortingArray {
    public static int[] sortArray(int[] arrayToSort) {
        int min;
        for (int i = 0; i < arrayToSort.length; i++) {
            min = arrayToSort[i];
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[j] < min) {
                    min = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[i];
                    arrayToSort[i] = min;
                }
            }
        }
        //Arrays.sort(arrayToSort);
        return arrayToSort;
    }
}
