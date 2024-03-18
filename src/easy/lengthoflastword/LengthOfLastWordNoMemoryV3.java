package src.easy.lengthoflastword;

public class LengthOfLastWordNoMemoryV3 {
    public static void main(String[] args) {
        String s = "Hello World    ";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s){
        for (int right = s.length() - 1; right > 0; right--) {
            if(s.charAt(right) == ' ') continue;
            int left = right;
            while (left >= 0 && s.charAt(left) != ' ') left--;
            return right - left;
        }
        return 0 ;
    }
}
