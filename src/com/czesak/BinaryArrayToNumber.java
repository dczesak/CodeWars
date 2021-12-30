package com.czesak;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int[] array = new int[binary.size()];
        for (int i = 0; i < binary.size(); i++) {
            array[i] = binary.get(i);
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        int result = 0;
        int pow = 1;
        result += array[0] * Math.pow(2,0);
        for (int i = 1; i < array.length; i++) {
            result+= array[i] * Math.pow(2,pow);
            pow++;
        }
        return result;
    }
}
