package src.jumpgame;

public class JumpGame {
    public static void main(String[] args) {
        int[] jumps = {2,0,0};
        System.out.println(canJump(jumps));

    }
    public static boolean canJump(int[] nums) {
        int fromEndToStart = nums.length - 1;
        int checkWith = fromEndToStart -  1;
        while(checkWith >= 0){
            int dis = fromEndToStart - checkWith;
            if(dis <= nums[checkWith]){
                fromEndToStart = checkWith;
            }else{
                return false;
            }
            checkWith--;
        }

        return true;
    }
}
