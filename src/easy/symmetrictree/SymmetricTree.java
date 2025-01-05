package src.easy.symmetrictree;

import src.util.TreeNode;

public class SymmetricTree {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root){
        if(root == null) return true;
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        if(left == null || right == null) return false;

        return right.val == left.val
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
}
