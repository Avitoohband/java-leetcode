package src.easy.mysqrt;

public class MySqrtV2 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        if (x < 2) return x;
        int start = 0;
        int end = x / 2;
        int res = 0;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if ((long) mid * mid <= x) {
                res = mid;
                start = mid + 1;
            } else end = mid - 1;
        }
        return res;
    }
}
