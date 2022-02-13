package com.czesak;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String data) {
        int value = 0;
        List<Integer> result = new ArrayList<>();
        for (char letter : data.toCharArray()) {
            switch (letter) {
                case 'i':
                    value++;
                    break;
                case 'd':
                    value--;
                    break;
                case 's':
                    value *= value;
                    break;
                case 'o':
                    result.add(value);
                    break;
                default:
                    System.out.println("Invalid letter");
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
