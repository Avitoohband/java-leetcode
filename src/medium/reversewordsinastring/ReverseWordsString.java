package src.medium.reversewordsinastring;

public class ReverseWordsString {

    public static void main(String[] args) {

        String s = "the sky is blue";
        //Output: "blue is sky the"
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s){
            if(s.length() < 2) return s;
            StringBuilder sb = new StringBuilder();

            for(int startWord  = s.length() - 1 ; startWord >= 0 ; startWord--){

                if(s.charAt(startWord) == ' ') continue;

                int endWords = startWord;

                while(endWords >= 0 && s.charAt(endWords) != ' '){
                    endWords--;
                }

                if(!sb.isEmpty()) sb.append(' ');
                sb.append(s, endWords + 1, startWord + 1);
                startWord = endWords;
            }
            return sb.toString();
        }
}
