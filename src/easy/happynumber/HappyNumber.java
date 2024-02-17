package src.easy.happynumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(2));  //false
        System.out.println(isHappy(19)); //true
        System.out.println(isHappy(1111111)); //true
    }

    public static boolean isHappy(int n) {
        long temp = n;
        Set<Long> set = new HashSet<>();
        do {
            if(!set.add(temp)) return false;
            long sum = 0;
            for (char c : String.valueOf(temp).toCharArray()) {
                sum += (long) Math.pow((c - '0'), 2);
            }
            temp = sum;
        } while (temp != 1);

        return true;
    }
}
