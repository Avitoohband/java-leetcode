package src;

public class temp {
    public static int[] X = new int[256];

    public static void main(String[] args) {
        int count = 0 ;
        mia(321, 21, 1, 0);
    }

    public static void mia(int a, int b, int c, int count ) {
        if (c > b) {
            count++;
            System.out.println("mia");
        } else {
            for (int i = X[c - 1] + 1; i <= a; i++) {
                X[c] = i;
                mia(a, b, c + 1, count);
            }
        }
    }


}
