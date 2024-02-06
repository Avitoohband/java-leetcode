package src.constructbinarytreepreposttrav;

import src.treetrav.TreeTrav;
import src.util.TreeNode;

import java.util.Arrays;

public class TreeFromPrePostTrav {
    public static void main(String[] args) {

        int[] preorder = {3, 9, 20, 15, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode treeNode = buildTree(preorder, postorder);
        TreeTrav.preOrder(treeNode);

    }

    public static TreeNode buildTree(int[] preorder, int[] postorder) {
        if (preorder.length == 0 || postorder.length == 0) return null;

        TreeNode root = new TreeNode(preorder[0]);

        if (preorder.length == 1) return root;

        int lengthOfRightSubTree = calcLengthOfSubTree(preorder, postorder);

        root.left = buildTree(
                Arrays.copyOfRange(
                        preorder, 1, lengthOfRightSubTree + 1
                ), Arrays.copyOfRange(
                        postorder, 0, lengthOfRightSubTree
                )
        );

        root.right = buildTree(
                Arrays.copyOfRange(
                        preorder, lengthOfRightSubTree + 1, preorder.length
                ), Arrays.copyOfRange(
                        postorder, lengthOfRightSubTree, postorder.length - 1
                )
        );

        return root;

    }

    private static int calcLengthOfSubTree(int[] preorder, int[] postorder) {

        for (int i = 0; i < postorder.length; i++) {
            if (postorder[i] == preorder[1]) return i + 1;
        }
        return 0;
    }
}
