package src.medium.reversewordsinastring;

import java.util.Arrays;

public class ReverseWordStringV3 {
    public static void main(String[] args) {
        String s = "the sky is blue"; // "blue is sky the"

        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') continue;

            int k = i;
            while (k > 0 && s.charAt(k) != ' '){
                k--;
            }

            if (!res.isEmpty()) res.append(" ");
            res.append(s, k, i + 1);
            i = k;
        }
        return res.toString();
    }
}
