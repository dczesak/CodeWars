package com.czesak;

public class TargetSum {
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers.length<2) {
            return null;
        }
        int[] indexes = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int first = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (first + numbers[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                    break;
                }
            }
        }
        return indexes;
    }
}
