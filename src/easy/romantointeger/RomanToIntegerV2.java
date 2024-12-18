package src.easy.romantointeger;

import java.util.Map;

public class RomanToIntegerV2 {
    public static void main(String[] args) {
        String s = "III";
        String s2 = "LVIII";
        String s3 = "MCMXCIV";

        System.out.println(romanToInteger(s));
        System.out.println(romanToInteger(s2));
        System.out.println(romanToInteger(s3));
    }

    public static Integer romanToInteger(String roman) {
        int res = 0;
        Map<Character, Integer> romans = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        for (int i = 0; i < roman.length() - 1; i++) {
            if (romans.get(roman.charAt(i)) < romans.get(roman.charAt(i + 1))) res -= romans.get(roman.charAt(i));
            else res += romans.get(roman.charAt(i));
        }
        return res += romans.get(roman.charAt(roman.length() - 1));
    }
}
