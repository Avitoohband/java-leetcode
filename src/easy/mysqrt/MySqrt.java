package src.easy.mysqrt;

public class MySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(2));
    }

    public static int mySqrt(int x) {
        if (x < 2) return x;
        int start = 0;
        int end = x / 2;
        int ans = 0;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if ((long) mid * mid <= x) {
                ans = mid;
                start = mid + 1;
            } else end = mid - 1;
        }
        return ans;
    }
}
