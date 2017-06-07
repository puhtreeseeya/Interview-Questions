package Chapter_4;
/* Implement a function to check if a tree is balanced. For the purposes of this question,
a balanced tree is defined to be a tree such that no two leaf nodes differ in distance
from the root by more than one. */

class BinaryNode {
    public int data;
    public BinaryNode left, right;
    public BinaryNode(int d) {
        data = d;
        left = right = null;
    }
}

public class BalancedTree_1 {
    BinaryNode root;
    public int height(BinaryNode binaryNode) {
        if (binaryNode == null) {
            return 0;
        }
        return 1 + Math.max(height(binaryNode.left), height(binaryNode.right));
    }

    public boolean isBalanced(BinaryNode root) {
        if (Math.abs(height(root.left)-height(root.right)) <= 1) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        //create binary tree
        BalancedTree_1 tree = new BalancedTree_1();
        tree.root = new BinaryNode(1);
        tree.root.left = new BinaryNode(2);
        tree.root.left.left = new BinaryNode(3);
        tree.root.left.right = new BinaryNode(4);
        tree.root.left.right.left = new BinaryNode (5);
        tree.root.right = new BinaryNode(6);
        tree.root.right.right = new BinaryNode(7);

        boolean res = tree.isBalanced(tree.root);
        System.out.print(res);
    }
}
