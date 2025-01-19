package src.medium.uniuqbinarytreeii;

import src.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinaryTreeII {
    public List<TreeNode> generateTrees(int n) {

    }
    public List<TreeNode> perform(int start, int end){
        List<TreeNode> treeNodes = new ArrayList<>();
        if( start == end) {
            return treeNodes.add(new TreeNode(start));

        }
    }
}
