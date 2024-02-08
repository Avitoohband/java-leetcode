package src.easy.lengthoflastword;

import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
    }

    public static int lengthOfLastWord(String s) {
        return Arrays.stream(
                s.trim().split(" ")
        ).toList().getLast().length();
    }

}
