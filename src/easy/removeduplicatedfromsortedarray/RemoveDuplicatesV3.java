package src.easy.removeduplicatedfromsortedarray;

public class RemoveDuplicatesV3
{
    public static int removeDuplicates(int[] nums){
        int i = 0 ;

        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}