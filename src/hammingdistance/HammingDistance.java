package src.hammingdistance;

public class HammingDistance {
    public static void main(String[] args) {

        System.out.println(solve(9, 14)); // 3
        System.out.println(solve(4, 8)); // 2
    }

    public static int solve(int a, int b){
        int newNum = a ^ b;
        int bits = 0 ;
        while(newNum > 0){
            newNum = newNum & newNum - 1;
            bits++;
        }
        return bits;
    }
}
