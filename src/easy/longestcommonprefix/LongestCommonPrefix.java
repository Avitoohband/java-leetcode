package src.easy.longestcommonprefix;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"dog","racecar","car"};
        System.out.println(longestCommonPref(arr));

    }

    public static String longestCommonPref(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        if (strs.length < 2) return strs[0];

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (
                        i >= strs[j].length()
                                || strs[0].charAt(i) != strs[j].charAt(i)) {
                    System.out.println(i);
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}
