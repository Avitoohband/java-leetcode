package src.stringcimpression;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        System.out.println(compress(chars));

        System.out.println(Arrays.toString(chars));

    }

    public static int compress(char[] chars){
        if(chars.length < 2) return chars.length;

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < chars.length){
            int count = 1 ;
            sb.append(chars[i]);
            while (i + 1 < chars.length && chars[i] == chars[i + 1]){
                i++;
                count++;
            }
            if(count > 1) sb.append(count);
            i++;
        }

        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }
}

