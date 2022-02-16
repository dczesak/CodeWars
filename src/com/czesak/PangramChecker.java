package com.czesak;

public class PangramChecker {
    /*
    A pangram is a sentence that contains every single letter of the alphabet at least once.
    Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     */

    public static boolean check(String sentence) {
        for (char character = 'a'; character <= 'z'; character++ ){
            if (!sentence.toLowerCase().contains("" + character)) {
                return false;
            }
        }
        return true;
    }
}
