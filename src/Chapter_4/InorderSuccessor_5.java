package Chapter_4;
/*Write an algorithm to find the ‘next’ node (i.e., in-order successor) of a given node in
a binary search tree where each node has a link to its parent.*/
class SuccessorNode {
    int data;
    SuccessorNode left, right, parent;

    SuccessorNode(int data) {
        this.data = data;
        left = right = parent = null;
    }
}

public class InorderSuccessor_5 {
    SuccessorNode findLeftSuccessor(SuccessorNode node) {
        if(node.left == null ) {
            return node;
        } else {
            return findLeftSuccessor(node.left);
        }
    }

    SuccessorNode findSuccessor(SuccessorNode node) {
        if(node.right == null) {
            return node.parent;
        } else {
            return findLeftSuccessor(node.right);
        }
    }



    public static void main(String[] args) {
        SuccessorNode root = new SuccessorNode(20);
        root.right = new SuccessorNode(22);
        root.right.parent = root;
        root.left = new SuccessorNode(8);
        root.left.parent = root;
        root.left.left = new SuccessorNode(4);
        root.left.left.parent = root.left;
        root.left.right = new SuccessorNode(12);
        root.left.right.parent = root.left;
        root.left.right.left = new SuccessorNode(10);
        root.left.right.left.parent = root.left.right;
        root.left.right.right = new SuccessorNode(14);
        root.left.right.right.parent = root.left.right;

        InorderSuccessor_5 driver = new InorderSuccessor_5();
        SuccessorNode node = driver.findSuccessor(root.left);
        System.out.print(node.data);

    }

}
