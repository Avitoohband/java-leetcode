package src.easy.inordertraversal;

import src.util.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        perform(root, res);
        return res;
    }

    public void perform(TreeNode root, List<Integer> res) {
        if (root == null) return;

        if (Objects.nonNull(root.left)) perform(root.left, res);
        res.add(root.val);
        if (Objects.nonNull(root.right)) perform(root.right, res);
    }

}
