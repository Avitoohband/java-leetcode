package src.isisomorphic;

import java.util.*;

public class isIsomorphic {
    public static void main(String[] args) {

        String s = "egg";
        String t = "add";
        // Output: true


        String s1 = "foo";
        String t1 = "bar";
        // Output: false


        String s2 = "paper";
        String t2 = "title";
        // Output: true

//        System.out.println(isIsomorph(s,t));
        System.out.println(isIsomorph(s1, t1));
//        System.out.println(isIsomorph(s2,t2));


    }

    public static boolean isIsomorph(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Character> charsMorphMap = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            char cChar = s.toCharArray()[i];
            char tChar = t.charAt(i);
            if (!charsMorphMap.containsKey(cChar)) {
                if (charsMorphMap.containsValue(tChar)) return false;

                charsMorphMap.put(cChar, tChar);
            } else if (charsMorphMap.get(cChar) != tChar) {
                return false;
            }
        }
        return true;
    }
}
