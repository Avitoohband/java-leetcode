package src.treetrav;

import src.rotatearray.RotateArray;
import src.util.TreeNode;

public class TreeTrav {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);

        root.left = left;
        root.right = right;

        root.right.left = rightLeft;
        root.right.right = rightRight;


//        preOrder(root);
//        inOrder(root);
//        postOrder(root);


    }

    public static void preOrder(TreeNode root) {
        if(root == null) return ;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TreeNode root) {
        if(root == null) return ;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);

    }

    public static void postOrder(TreeNode root) {
        if(root == null) return ;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");

    }

}
