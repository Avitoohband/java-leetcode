package src.pathsum;

import src.util.TreeNode;

public class PathSum {

    public static void main(String[] args) {

    }

    public static boolean hasPathSum (TreeNode root, int targetSum){
        if( root == null) return false;
        if(root.left == null && root.right == null && targetSum == root.val) return true;

        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);

        return  left || right;
    }
}
