//package Chapter_4;
//
///*Design an algorithm and write code to find the first common ancestor of two nodes
//in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
//necessarily a binary search tree.*/
//
//import DataStructures.SuccessorNode;
//
//public class CommonAncestor_6 {
//    public boolean checkSubTree(SuccessorNode parent, SuccessorNode node2) {
//
//    }
//    public SuccessorNode findCommonRoot(SuccessorNode node1, SuccessorNode node2) {
//        if(node1 == node2 ) {
//            return node1;
//        } else {
//
//        }
//    }
//
//    public static void main(String[] args){
//        SuccessorNode root = new SuccessorNode(20);
//        root.right = new SuccessorNode(22);
//        root.right.parent = root;
//        root.left = new SuccessorNode(8);
//        root.left.parent = root;
//        root.left.left = new SuccessorNode(4);
//        root.left.left.parent = root.left;
//        root.left.right = new SuccessorNode(12);
//        root.left.right.parent = root.left;
//        root.left.right.left = new SuccessorNode(10);
//        root.left.right.left.parent = root.left.right;
//        root.left.right.right = new SuccessorNode(14);
//        root.left.right.right.parent = root.left.right;
//
//        CommonAncestor_6 driver = new CommonAncestor_6();
//        SuccessorNode LCA = driver.findCommonRoot(root.left.left, root.left.right.left);
//        System.out.println(LCA.data);
//
//    }
//}
