package src.easy.issubsequence;

public class IsSubsequence {
    public static void main(String[] args) {

    }
    public static boolean isSub(String s, String t){
        if(s.isEmpty()) return true;
        if(t.isEmpty() || t.length() < s.length()) return false;
        int charAtS = 0;
        for (int i = 0; i < t.length() && charAtS < s.length(); i++) {
            if(t.charAt(i) == s.charAt(charAtS)) charAtS++;
        }
        return charAtS == s.length();
    }
}
