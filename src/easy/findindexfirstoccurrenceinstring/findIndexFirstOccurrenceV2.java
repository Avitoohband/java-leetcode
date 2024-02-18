package src.easy.findindexfirstoccurrenceinstring;

public class findIndexFirstOccurrenceV2 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        if (haystack.isEmpty() || haystack.length() < needle.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                while (j < needle.length() &&
                        haystack.charAt(i + j) == needle.charAt(j)){
                    j++;
                }
                if (j == needle.length()) return i;
            }
        }
        return -1;
    }
}
