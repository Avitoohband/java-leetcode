package src.easy.findindexfirstoccurrenceinstring;

public class findIndexFirstOccurrenceV3 {

    public static void main(String[] args) {
        while (true) strStr("hello", "ll");
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() <= haystack.length()) {
            for (int i = 0; i < haystack.length(); i++) {
                if (needle.length() > haystack.length() - i) break;
                int needleIndex = 0;
                while (needleIndex <= needle.length()) {
                    if (needleIndex == needle.length()) return i;
                    if (needle.charAt(needleIndex) != haystack.charAt(i + needleIndex++)) break;
                }
            }
        }
        return -1;
    }
}
