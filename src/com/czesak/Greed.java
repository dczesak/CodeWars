package com.czesak;

public class Greed {
    public static int greedy(int[] dice) {
        /*
        
         */
        int result = 0;
        int onesCounter = 0;
        int twosCounter = 0;
        int threesCounter = 0;
        int foursCounter = 0;
        int fivesCounter = 0;
        int sixesCounter = 0;
        for (int i : dice) {
            if (i == 1) onesCounter++;
            if (i == 2) twosCounter++;
            if (i == 3) threesCounter++;
            if (i == 4) foursCounter++;
            if (i == 5) fivesCounter++;
            if (i == 6) sixesCounter++;


        }
        if (onesCounter >= 3) result += 1000 + (onesCounter-3)*100;
        else result += onesCounter * 100;

        if (twosCounter >= 3) result += 200;
        if (threesCounter >= 3) result += 300;
        if (foursCounter >= 3) result += 400;

        if (fivesCounter >= 3) result += 500 + (fivesCounter - 3) * 50;
        else result += fivesCounter * 50;

        if (sixesCounter >= 3) result += 600;

        return result;
    }
}
