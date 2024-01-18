package src.wordbreak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {
    public static void main(String[] args) {

        String s = "leetcode";
        List<String> wordDict =  new ArrayList<>() ;
        wordDict.add("leet");
        wordDict.add("code");

        System.out.println(wordBreak(s, wordDict));

    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Map<String, Boolean> dp = new HashMap<>();
        return solve(s, wordDict, dp);
    }

    private static boolean solve(String s, List<String> wordDict, Map<String, Boolean> dp){
        if(dp.containsKey(s)) return dp.get(s);
        if (s.length() == 0) return true;

        for (String word : wordDict) {
            if (word.length() <= s.length()
                    && word.charAt(0) == s.charAt(0)
                    && word.equals(s.substring(0, word.length()))) {
                if (solve(s.substring(word.length()), wordDict, dp) ) {
                    dp.put(s, true);
                    return true;
                }
            }
        }
        dp.put(s, false);
        return false;
    }
}
