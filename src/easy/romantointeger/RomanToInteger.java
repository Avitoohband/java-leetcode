package src.easy.romantointeger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        if (s.isEmpty()) return 0;
        Map<Character, Integer> romanMap = new HashMap<>();
        int num = 0;

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) {
            if (num == 0) num += romanMap.get(s.charAt(i));
            else if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                num += romanMap.get(s.charAt(i));
            } else {
                num -= romanMap.get(s.charAt(i));
            }
        }
        return num;

    }
}
