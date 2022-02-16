package com.czesak;

public class FindOutlier {
    /*
    You are given an array (which will have a length of at least 3, but could be very large) containing integers.
    The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
    Write a method that takes the array as an argument and returns this "outlier" N.
     */

    public static int find (int[] integers) {

        int oddCounter = 0;
        int evenCounter = 0;
        int oddOutlier = 0;
        int evenOutlier = 0;

        for (int integer : integers) {
            if (integer % 2 == 0) {
                evenOutlier = integer;
                evenCounter++;
            } else {
                oddCounter++;
                oddOutlier = integer;
            }
        }

        if (oddCounter > 1) {
            return evenOutlier;
        } else if (evenCounter > 1){
            return oddOutlier;
        }
        return evenCounter > 1 ? oddOutlier:evenOutlier;
    }
}
