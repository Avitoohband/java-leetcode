package src.easy.findindexfirstoccurrenceinstring;

public class findIndexFirstOccurrence {
    public static void main(String[] args) {
        String haystack  = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));

    }
    public static int strStr(String haystack, String needle){
        if(haystack.length() < needle.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)){
                int k;
                for (k = 0; k < needle.length(); k++) {
                    if(haystack.charAt(i + k) != needle.charAt(k)) break;
                }
                if(k == needle.length()) return i;
            };
        }
        return -1;
    }
}
