package Chapter_4;
import DataStructures.BinaryNode;
/*Given a sorted (increasing order) array, write an algorithm to create a binary tree with
minimal height.*/

class MinBinaryTree_3 {

    static BinaryNode root;


    BinaryNode arrayToBST(int array[], int start, int end) {
        if(start > end) {
            return null;
        } else {
            int mid = (start+end)/2;
            BinaryNode node = new BinaryNode(array[mid]);
            node.left = arrayToBST(array, start, mid-1);
            node.right = arrayToBST(array, mid+1, end);
            return node;
        }
    }

    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 0;
        int end = arr1.length;
        MinBinaryTree_3 driver = new MinBinaryTree_3();
        BinaryNode root = driver.arrayToBST(arr1, start, end);

    }

}
