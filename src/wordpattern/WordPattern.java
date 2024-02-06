package src.wordpattern;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        // OUTPUT: True

        String pattern2 = "ab";
        String s2 = "happy hacking";
        // OUTPUT: true

        System.out.println(wordPattern(pattern, s));
        System.out.println(wordPattern(pattern2, s2));

    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        Map<Character, String> jumpsMap = new HashMap<>();
        char[] patternChars = pattern.toCharArray();
        for (int i = 0; i < patternChars.length; i++) {
            char c = patternChars[i];
            if (!jumpsMap.containsKey(c)) {
                if (jumpsMap.containsValue(words[i])) return false;
                jumpsMap.put(c, words[i]);
            } else if (!jumpsMap.get(c).equals(words[i])) return false;
        }

        return true;
    }

//    private static String extractFirstCharacters(String s) {
//        return Arrays.stream(s.split("\\s+"))
//                .filter(word -> !word.isEmpty())
//                .map(word -> String.valueOf(word.charAt(0)))
//                .collect(Collectors.joining());
//    }
}
