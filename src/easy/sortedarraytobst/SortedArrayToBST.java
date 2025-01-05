package src.easy.sortedarraytobst;

import com.sun.source.tree.Tree;
import src.util.TreeNode;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0 ) return null;
        return perform(nums, 0, nums.length - 1);
    }

    public TreeNode perform(int[] nums, int start, int end) {
        if (start > end) return null;
        int midIndex = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[midIndex]);
        root.left = perform(nums, start, midIndex - 1);
        root.right = perform(nums, midIndex + 1, end);
        return root;
    }
}
