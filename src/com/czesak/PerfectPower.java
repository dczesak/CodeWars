package com.czesak;

import java.util.Arrays;

public class PerfectPower {
    /*
    A perfect power is a classification of positive integers:
    In mathematics, a perfect power is a positive integer that can be expressed as an integer power of
    another positive integer. More formally, n is a perfect power if there exist natural
    numbers m > 1, and k > 1 such that mk = n.
    Your task is to check wheter a given integer is a perfect power. If it is a perfect power,
    return a pair m and k with mk = n as a proof. Otherwise return Nothing, Nil, null, NULL, None
    or your language's equivalent.
     */

    public static int[] isPerfectPower(int n) {
        int m;
        int k;
        int[] result = new int[2];

        for (int i = 2; i < n; i++) {
            m = i;
            for (int j = 2; j < n; j++) {
                k = j;
                if (Math.pow(m, k) == n) {
                    result[0] = m;
                    result[1] = k;
                }
            }
        }
        if (Arrays.stream(result).allMatch(e -> e !=0)) {
            return result;
        }
         else return null;
    }
}
