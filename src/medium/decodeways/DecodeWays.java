package src.medium.decodeways;

import java.util.HashMap;
import java.util.Map;

public class DecodeWays {
    public static void main(String[] args) {
        String s1 = "12";
        String s2 = "226";

        System.out.println(numDecodings(s1));
        System.out.println(numDecodings(s2));
    }

    public static int numDecodings(String s) {
        return memoHelper(new HashMap<>(), s, 0);

    }

    public static int memoHelper(Map<Integer, Integer> dp, String s, int index) {
        if (dp.containsKey(index)) return dp.get(index);
        if (index == s.length()) return 1;
        if (s.charAt(index) == '0') return 0;

        dp.put(index, memoHelper(dp, s, index + 1) +
                (index + 1 < s.length() && Integer.parseInt(s.substring(index, index + 2))
                        < 27 ? memoHelper(dp, s, index + 2) : 0));

        return dp.get(index);
    }
}
