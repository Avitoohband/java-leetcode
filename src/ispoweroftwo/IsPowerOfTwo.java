package src.ispoweroftwo;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(Solution.isPowerOfTwo(3));
    }

    public static class Solution{
        public static boolean isPowerOfTwo(int num){
            return (num & (num-1)) == 0;
        }
    }
}
