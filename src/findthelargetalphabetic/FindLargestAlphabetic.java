package src.findthelargetalphabetic;

import java.util.Arrays;

public class FindLargestAlphabetic {
    public static void main(String[] args) {
        System.out.println(findLargestAlphabetic("admeDCAB"));
        System.out.println(findLargestAlphabetic("dAeB"));
    }

    public static String findLargestAlphabetic(String string) {
        int[] ascii = new int[256];
        Arrays.fill(ascii, 0);

        for (char c : string.toCharArray()) {
            ascii[(int) c] = 1;
        }
        for (int i = ascii.length - 1; i >= 0; i--) {
            if (ascii[i] == 1 && ascii[i - 32] == 1) {
                return (char) (i - 32) + "";
            }
        }
        return "-1";
    }
}