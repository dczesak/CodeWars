package com.czesak;

public class Diamond {
    public static String print(int n) {
        if (n % 2  == 0 || n <= 0) {
            return null;
        }
        StringBuffer result = new StringBuffer();
        for (int i = 1; i <= n; i+=2) {
            result.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        for (int i = n - 2; i >= 1; i-=2) {
            result.append(" ".repeat((n - i) / 2) + "*".repeat(i) + "\n");
        }
        return result.toString();
    }
}
