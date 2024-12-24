package src.easy.plusone;

public class PlusOneV2 {
    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        while (index >= 0) {
            if (digits[index] < 9) {
                digits[index]++;
                return digits;
            }
            digits[index--] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
