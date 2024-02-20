package src.easy.plusone;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits){
        int end;
        for (end = digits.length - 1; end >= 0; end--) {
            if(digits[end] == 9) {
                digits[end] = 0;
                continue;
            }
            digits[end]++;
            return digits;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;

        System.arraycopy(digits, 0, newDigits, 1, newDigits.length - 1);

        return newDigits;

    }
}
