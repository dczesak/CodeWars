package com.czesak;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String str = "xxooo";
        System.out.println(check(str));
        System.out.println("***********");

        //PIN validation
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("1234a"));
        System.out.println(validatePin("a234"));
        System.out.println(validatePin(".234"));
        System.out.println("***********");

        //DigPow
        System.out.println(DigPow.digPow(89, 1));
        System.out.println(DigPow.digPow(92, 1));
        System.out.println(DigPow.digPow(695, 2));
        System.out.println(DigPow.digPow(46288, 3));
        System.out.println("***********");

        //tribonacci
        System.out.println(Arrays.toString(Xbonacci.tribonacci(new double[]{1, 1, 1}, 10)));
        System.out.println("***********");

        //String order
        System.out.println(Order.order("is2 Thi1s T4est 3a"));
        System.out.println(Order.order("4of Fo1r pe6ople g3ood th5e the2"));
        System.out.println("***********");

        //Binary array to number
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        System.out.println(BinaryArrayToNumber.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));
        System.out.println("***********");

        //Camel case breaking
        System.out.println(CamelCasingSolution.camelCase("camelCasing"));
        System.out.println("***********");

        //Array to phone number
        System.out.println(ArrayToPhoneNumber.createPhoneNumber(new int[] {1,2,3,4,5,6,7,8,9,0}));
        System.out.println("***********");

        //String to camelCase
        System.out.println(StringToCamelCase.toCamelCase("the_Stealth_Warrior"));
        System.out.println(StringToCamelCase.toCamelCase("the-Stealth-Warrior"));
        System.out.println("***********");

        //Sorting int array
        System.out.println(Arrays.toString(SortingArray.sortArray(new int[]{5, 2, 3, 6})));
        System.out.println("***********");

        //Reverse string
        System.out.println(StringReverse.reverseString("abc"));
        System.out.println("***********");

        //Target sum
        System.out.println(Arrays.toString(TargetSum.twoSum(new int[]{3,2,4}, 6)));
        System.out.println("***********");

        //Diamond
        System.out.println(Diamond.print(5));
        System.out.println("***********");

        //BouncingBall
        System.out.println(BouncingBall.bouncingBall(3,0.66,1.5));
        System.out.println("***********");

        //FoldAnArray
        System.out.println(Arrays.toString(FoldAnArray.foldArray(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println("***********");

        //Greed
        System.out.println(Greed.greedy(new int[] {2,4,4,5,4}));
        System.out.println("***********");

        //WhoLikesIt
        System.out.println(WhoLikesIt.whoLikesIt("Adam","Leo", "Brad", "Dominik"));
        System.out.println("***********");

        //PangramChecker
        System.out.println(PangramChecker.check("You shall not pass!"));
        System.out.println("***********");

        //FindOutlier
        System.out.println(FindOutlier.find(new int[] {160, 3, 1719, 19, 11, 13, -21}));
        System.out.println("***********");

        //SortOddNumbers
        System.out.println(Arrays.toString(SortOddNumbers.sort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
    }

    private static boolean check(String str) {
        int x = 0;
        int o = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                o++;
            }
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                x++;
            }
        }
        return x == o;
    }

    private static boolean validatePin(String pin) {
        return (pin.length() == 4 || pin.length() == 6) && pin.matches("[0-9]+");
    }
}

