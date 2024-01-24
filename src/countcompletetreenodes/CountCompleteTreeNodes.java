package src.countcompletetreenodes;

import src.util.TreeNode;

public class CountCompleteTreeNodes {
    public static void main(String[] args) {

    }

    public static int countNodes(TreeNode root){
        if( root == null) return 0;
        return 1 + countNodes(root.right) + countNodes(root.left);
    }
}
