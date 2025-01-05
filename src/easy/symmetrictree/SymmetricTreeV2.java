package src.easy.symmetrictree;

import src.util.TreeNode;

public class SymmetricTreeV2 {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return perform(root.left, root.right);
    }
    public static boolean perform(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        return left.val == right.val
                && perform(left.left, right.right)
                && perform(left.right, right.left);
    }
}
