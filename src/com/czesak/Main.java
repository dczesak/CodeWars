package com.czesak;


public class Main {

    public static void main(String[] args) {
        String str ="xxooo";
        System.out.println(check(str));
        System.out.println("***********");
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("1234a"));
        System.out.println(validatePin("a234"));
        System.out.println(validatePin(".234"));

    }

    private static boolean check(String str) {
        int x = 0;
        int o = 0;

        for (int i = 0; i < str.length();i++){
            if(str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                o++;
            }
            if(str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                x++;
            }
        }
        if (x == o) {
            return true;
        } else return false;
    }

   private static boolean validatePin(String pin){
        if ((pin.length() == 4 || pin.length() == 6) && pin.matches("[0-9]+")) return true;
        return false;
   }
}

