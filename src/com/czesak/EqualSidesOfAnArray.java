package com.czesak;

public class EqualSidesOfAnArray {
    /*
    You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of
    the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index
    that would make this happen, return -1.
     */
    public static int findEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (leftSum(arr,i) == rightSum(arr,i)) {
                return i;
            }
        }
        return -1;
    }

    private static int leftSum(int[] arr, int index) {
        int result = 0;
        for (int i = 0; i < index; i++) {
            result += arr[i];
        }
        return result;
    }

    private static int rightSum(int[] arr, int index) {
        int result = 0;
        for (int i = index+1; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }
}
