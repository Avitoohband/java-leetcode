package src.easy.maximumdepthofbinaryytree;

import src.util.TreeNode;

public class MaximumDepthOfBinaryTreeV2 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
