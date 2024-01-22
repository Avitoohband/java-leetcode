package src.sametree;

import src.util.TreeNode;

public class SameTree {
    public static void main(String[] args) {
        //data for test
    }

    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null || p.val != q.val) return false;

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
