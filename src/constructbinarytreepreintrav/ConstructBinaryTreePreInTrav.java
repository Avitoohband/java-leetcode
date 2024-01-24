package src.constructbinarytreepreintrav;

import src.treetrav.TreeTrav;
import src.util.TreeNode;

import java.util.*;

public class ConstructBinaryTreePreInTrav {
    public static void main(String[] args) {

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode treeNode = buildTree(preorder, inorder);
        TreeTrav.preOrder(treeNode);
        // Output: [3,9,20,null,null,15,7]

    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0 ) return null;

        TreeNode root = new TreeNode(preorder[0]);

        List<Integer> preorderList = Arrays.stream(preorder).boxed().toList();
        List<Integer> inorderList = Arrays.stream(inorder).boxed().toList();

        int mid = inorderList.indexOf(root.val);

        root.left = buildTree(
                listToIntArray(preorderList.subList(1, mid + 1))
                ,listToIntArray(inorderList.subList(0, mid))
        );

        root.right = buildTree(
                listToIntArray(preorderList.subList(mid + 1, preorder.length))
                ,listToIntArray(inorderList.subList(mid + 1, inorder.length))
        );
        return root;
    }

    private static int[] listToIntArray (List<Integer> list){
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
