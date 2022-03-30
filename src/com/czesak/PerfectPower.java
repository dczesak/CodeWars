package com.czesak;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> temp = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            m = i;
            for (int j = 2; j < n; j++) {
                k = j;
                if (Math.pow(m, k) == n) {
                    temp.add(m);
                    temp.add(k);
                }
            }
        }

        if (temp.isEmpty()) {
            return null;
        } else {
            for (int i = 0; i < 2; i++) {
                result.add(temp.get(i));
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
