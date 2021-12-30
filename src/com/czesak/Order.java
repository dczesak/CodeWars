package com.czesak;

public class Order {
    public static String order (String words) {
        String[] array = words.split(" ");
        String result = "";
        for (int i = 1; i < 10; i++) {
            for (String s : array) {
                if (s.contains(String.valueOf(i))) {
                    result = result + s + " ";
                }
            }
        }
        return result.trim();
    }
}
