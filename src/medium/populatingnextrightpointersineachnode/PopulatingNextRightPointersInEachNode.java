package src.medium.populatingnextrightpointersineachnode;

import src.util.Node;

public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root == null) return null;

        Node left = root.left;
        Node right = root.right;

        if(left != null) left.next = right;
        if(right != null && root.next != null) {
            right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);
        return root;
    }
}
