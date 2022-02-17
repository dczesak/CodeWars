package com.czesak;

import java.util.Arrays;

public class SortOddNumbers {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                for (int j = i + 1; j < array.length; j++)
                if (array[i] > array[j] && array[j] % 2 == 1) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
