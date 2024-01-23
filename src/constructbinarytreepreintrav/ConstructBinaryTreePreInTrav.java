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
                preorderList.subList(1, mid + 1).toArray() ,inorderList.subList(0, mid).toArray()
        )

        return root;

    }

    private static int[] listToIntArray (List<Integer> list){
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

//    private static TreeNode splitTree(int[] preorder, int[] inorder,
//                                      Map<Integer, Integer> inorderIndexMap,
//                                      int rootIndex, int left, int right) {
//        if (rootIndex > preorder.length - 1) return null;
//        TreeNode root = new TreeNode(preorder[rootIndex]);
//
//
//        int mid = inorderIndexMap.get(preorder[rootIndex]);
//
//        root.left = splitTree(preorder, inorder, inorderIndexMap,
//                rootIndex + 1, left, right - mid);
//
//        root.right = splitTree(preorder, inorder, inorderIndexMap,
//                rootIndex + 1, left + mid, right
//        );
//
//        return root;
//
//    }
}
