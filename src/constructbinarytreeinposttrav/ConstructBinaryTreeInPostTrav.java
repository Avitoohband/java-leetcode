package src.constructbinarytreeinposttrav;

import src.treetrav.TreeTrav;
import src.util.TreeNode;

import java.util.Arrays;
import java.util.List;

public class ConstructBinaryTreeInPostTrav {
    public static void main(String[] args) {


        int [] postorder = {9, 15, 7, 20, 3};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode treeNode = buildTree(inorder, postorder);
        TreeTrav.preOrder(treeNode);
        // Output: [3,9,20,null,null,15,7]

    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || postorder.length == 0) return null;

        TreeNode root = new TreeNode(postorder[postorder.length - 1]);

        int mid = findIndex(root.val, inorder);

        root.left = buildTree(
                Arrays.copyOfRange(inorder,0, mid),
                Arrays.copyOfRange(postorder, 0, mid)
        );

        root.right = buildTree(
                Arrays.copyOfRange(inorder,mid + 1, inorder.length),
                Arrays.copyOfRange(postorder, mid, postorder.length - 1)
        );

        return root;


    }
    private static int findIndex(int val, int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) return i;
        }
        return -1;
    }
}
