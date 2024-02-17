package src.easy.happynumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumberNoMemory {

    public static void main(String[] args) {
        System.out.println(isHappy(2));  //false
        System.out.println(isHappy(19)); //true
        System.out.println(isHappy(1111111)); //true
    }

    public static boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = helper(slow);
            fast = helper(helper(fast));
        } while (slow != fast);


        return slow == 1;
    }

    public static int helper(int num) {
        int sum = 0;

        for (char c : String.valueOf(num).toCharArray()) {
            sum += (int) Math.pow(c - '0', 2);
        }
        return sum;
    }
}
