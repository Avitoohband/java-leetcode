package src.randompickfromarray;

public class RandomPickFromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 3};
        Solution solution = new Solution(arr);
        System.out.println(solution.pick());
        System.out.println(solution.pick());
        System.out.println(solution.pick());
        System.out.println(solution.pick());
        System.out.println(solution.pick());

    }
}

class Solution {
    int[] arr;
    int arrLength;

    public Solution(int[] nums) {
        this.arr = nums;
        this.arrLength = nums.length;
    }

    public int pick() {
        int randomIndex = (int)(Math.random() * arrLength);
        int random = arr[randomIndex];
        swap(randomIndex);
        return random;

    }

    private void swap(int randomIndex) {
        int temp = arr[randomIndex];
        arr[randomIndex] = arr[arrLength - 1];
        arr[arrLength - 1] = temp;
        arrLength--;
    }
}

