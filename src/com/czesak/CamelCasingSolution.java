package com.czesak;

public class CamelCasingSolution {
    public static String camelCase(String input) {
        String x = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                x = x + " ";
            }
            x = x + input.charAt(i);
        }
        return x;
    }
}
