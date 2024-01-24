package src.lowestcommonancestorofabinarytree;

import src.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LCAStorePath {
    public static void main(String[] args) {

//        TreeNode root = new TreeNode(3);
//        TreeNode left = new TreeNode(9);
//        TreeNode right = new TreeNode(20);
//        TreeNode rightLeft = new TreeNode(15);
//        TreeNode rightRight = new TreeNode(7);
//
//        root.left = left;
//        root.right = right;
//
//        root.right.left = rightLeft;
//        root.right.right = rightRight;
//
//        lowestCommonAncestor(root, rightLeft, left);

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode lca = new TreeNode();
        List<TreeNode> pathToP = new ArrayList<>();
        List<TreeNode> pathToQ = new ArrayList<>();

        if (findPath(root, p, pathToP) && findPath(root, q, pathToQ)) {
            for (TreeNode pNode : pathToP) {
                for (TreeNode qNode : pathToQ) {
                    if (qNode.val == pNode.val) {
                        lca = qNode;
                        break;
                    }
                }
            }
        }
        return lca;
    }

    private static boolean findPath(TreeNode root, TreeNode destination, List<TreeNode> path) {
        if (root == null) return false;

        path.add(root);

        if (root.val == destination.val) return true;

        if (
                findPath(root.left, destination, path)
                        || findPath(root.right, destination, path)

        ) return true;


        path.removeLast();
        return false;
    }
}
