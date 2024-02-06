package src.candy;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {

    }

    public static int candy(int[] ratings) {
        if (ratings.length < 2) return 1;
        int[] cookies = new int[ratings.length];

        Arrays.fill(cookies, 1);
        for (int i = 1; i < cookies.length; i++) {
            cookies[i] = ratings[i] > ratings[i - 1] ? cookies[i - 1] + 1 : cookies[i];
        }

        for (int i = cookies.length - 2; i >= 0; i--) {
            cookies[i] = ratings[i] > ratings[i + 1] ? Math.max(
                    cookies[i], cookies[i + 1] + 1
            ) : cookies[i];
        }
        return Arrays.stream(cookies).sum();
    }
}
