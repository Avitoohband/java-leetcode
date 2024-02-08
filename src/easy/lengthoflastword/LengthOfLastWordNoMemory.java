package src.easy.lengthoflastword;

import java.util.Arrays;

public class LengthOfLastWordNoMemory {
    public static void main(String[] args) {
    }

    public static int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) return 0;

        int start = s.length() - 1;

        while (start >= 0 && Character.isWhitespace(s.charAt(start))) start--;

        int end = start;

        while (end >= 0 && !Character.isWhitespace(s.charAt(end))) end--;

        return start - end;
    }

}
