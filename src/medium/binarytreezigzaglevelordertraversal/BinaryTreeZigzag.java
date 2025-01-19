package src.medium.binarytreezigzaglevelordertraversal;

import src.util.TreeNode;

import java.util.*;

public class BinaryTreeZigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        boolean rightToLeft = false;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }
            if (rightToLeft) {
                level = level.reversed();
            }
            res.add(level);
            rightToLeft = !rightToLeft;
        }
        return res;
    }
}