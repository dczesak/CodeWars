package com.czesak;

public class StringToCamelCase {
    static String toCamelCase(String s) {
        String[] words = s.split("[_\\-]");
        s=words[0];
        for(int i=1; i<words.length; i++)
            s+=words[i].substring(0,1).toUpperCase()+words[i].substring(1).toLowerCase();
        return s;
    }
}
