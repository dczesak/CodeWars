package com.czesak;

public class WhoLikesIt {
    /*
    Implement the function which takes an array containing the names of people that like an item.
     It must return the display text
     */

    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0:
                return "no one likes it";
            case 1:
                return String.format("%s likes it", names[0]);
            case 2:
                return String.format("%s and %s like it", names[0], names[1]);
            case 3:
                return String.format("%s, %s and %s like it", names[0], names[1], names[2]);
            default:
                return String.format("%s, %s and %d others like it", names[0], names[1], names.length-2);
        }
    }
}
