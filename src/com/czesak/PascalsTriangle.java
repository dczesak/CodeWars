package com.czesak;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    /*
    In mathematics, Pascal's triangle is a triangular array of the binomial coefficients expressed with formula
    (n/k)=n!/(k!(n−k)!) where n denotes a row of the triangle, and k is a position of a term in the row.
    Write a function that, given a depth n, returns n top rows of Pascal's Triangle flattened into a
    one-dimensional list/array.
     */

    public static long[] generate(int level) {
        List<Long> result = new ArrayList<Long>();
        for (int i = 0; i < level; i++) {
            long number = 1;
            for (int j = 0; j <= i; j++) {
                result.add(number);
                number = (number * (i - j)) / (j + 1);
            }
        }
        return result.stream().mapToLong(i -> i).toArray();
    }
}
