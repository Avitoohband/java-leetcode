package src.reversestring;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        char[] s = {'h', 'e', 'l', 'l', 'o'};
//        Output: ['o','l','l','e','h']

        reverseString(s);
        System.out.println(Arrays.toString(s));

    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j)swap(s, i++ ,j-- );
    }

    private static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}

