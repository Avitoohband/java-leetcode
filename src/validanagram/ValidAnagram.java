package src.validanagram;

public class ValidAnagram {
    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";

        String s1 = "a";
        String t1 = "ab";

        System.out.println(isAnag(s1, t1));

    }

    public static boolean isAnag(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] ascii = new int[256];
        for (char c : s.toCharArray()) {
            ascii[c]++;
        }

        for (char c : t.toCharArray()) {
            ascii[c]--;
            if (ascii[c] < 0) return false;
        }
        return true;

    }
}
