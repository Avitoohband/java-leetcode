package src.easy.lengthoflastword;

public class LengthOfLastWordNoMemoryV2 {
    public static void main(String[] args) {
    }

    public static int lengthOfLastWord(String s) {
        for (int end = s.length() - 1; end >= 0; end--) {
            if (s.charAt(end) == ' ') continue;

            int start = end;
            while (start >= 0 && s.charAt(start) != ' ') start--;

            return end - start;
        }

        return 0;
    }
}
