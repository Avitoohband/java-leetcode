package src;

public class HowManyWaysFromXtoY {
    public static void main(String[] args) {
        int x1 = 0, y1 = 0, x2 = 5, y2 = 6;
        System.out.println(numOfWays(x1, y1, x2, y2));
    }

    public static int numOfWays(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) return 1;
        if (x1 > x2 || y1 > y2) return 0;

        return numOfWays(x1 + 1, y1, x2, y2) + numOfWays(x1, y1 + 1, x2, y2);
    }
}