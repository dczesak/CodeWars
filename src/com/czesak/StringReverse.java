package com.czesak;

public class StringReverse {
    public static String reverseString(String s) {
        String reverse = "";
        char temp;
        for (int i = s.length()-1; i >= 0; i--) {
            temp=s.charAt(i);
            reverse+=temp;
        }
        return reverse;
    }
}
