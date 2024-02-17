package src.easy.longestcommonprefix;

public class LongestCommonPrefixV2 {
    public static void main(String[] args) {

    }

    public static String longestCommonPref(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) return sb.toString();
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
