package src.medium.reversewordsinastring;

public class ReverseWordsStringV2 {

    public static void main(String[] args) {

        String s = "the sky is blue";
        //Output: "blue is sky the"
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s){
        StringBuilder sb = new StringBuilder();

        for (int wordEndingAt = s.length() -1; wordEndingAt >= 0; wordEndingAt--) {
            if(s.charAt(wordEndingAt) == ' ') continue;

            int wordStartingAt = wordEndingAt;
            while(wordStartingAt >= 0 && s.charAt(wordStartingAt) != ' ') wordStartingAt--;

            if(!sb.isEmpty()) sb.append(' ');
            sb.append(s, wordStartingAt + 1, wordEndingAt + 1);
            wordEndingAt = wordStartingAt;

        }
        return sb.toString();
    }
}
