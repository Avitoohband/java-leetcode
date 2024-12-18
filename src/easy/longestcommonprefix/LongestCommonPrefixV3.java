package src.easy.longestcommonprefix;

import java.util.List;

public class LongestCommonPrefixV3 {
    public static void main(String[] args) {
        String[] arr = new String[]{"flower", "flow", "fl"};
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < arr[0].length(); j++) {
            for (int i = 0; i < arr.length; i++) {
                if (j >= arr[i].length()
                        || arr[i].charAt(j) != arr[0].charAt(j)) return sb.toString();
            }
            sb.append(arr[0].charAt(j));
        }
        return sb.toString();
    }
}
