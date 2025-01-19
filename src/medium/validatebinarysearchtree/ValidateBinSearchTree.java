package src.medium.validatebinarysearchtree;

import src.util.TreeNode;

public class ValidateBinSearchTree {
    public static void main(String[] args) {

    }

    public static boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValid(TreeNode root, long lowerThanMe, long higherThanMe) {
        if (root == null) return true;

        if(root.val <= lowerThanMe || root.val >= higherThanMe) return false;

        return isValid(root.left, lowerThanMe, root.val) && isValid(root.right, root.val, higherThanMe);
    }
}
