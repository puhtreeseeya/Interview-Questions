package Chapter_4;
/*Given a binary search tree, design an algorithm which creates a linked list of all the
nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).*/

import DataStructures.BinaryNode;

class listNode {
    int data;
    listNode left, right, next;

    listNode(int data) {
        this.data = data;
        left = right = next = null;
    }
}

public class DepthList_4 {

    void createList(listNode node) {
        if(node == null) {
            return;
        }

        if(node.left != null) {
            node.left.next = node.right;
        }
        if(node.right != null) {
            if(node.next != null) {
                if(node.next.left != null) {
                    node.right.next = node.next.left;
                } else {
                    node.right.next = node.next.right;
                }
            }
        }
        createList(node.left);
        createList(node.right);
    }

    void printList(listNode node) {
        for(listNode start = node; start!=null; start = start.next) {
            System.out.println(start.data);
        }
    }


    public static void main(String[] args ){
        listNode root = new listNode(1);
        root.left = new listNode(2);
        root.right = new listNode(3);
        root.left.left = new listNode(4);
        root.left.right = new listNode(5);
        root.right.left = new listNode(6);
        root.next = null;

        System.out.println("hello");

        DepthList_4 driver = new DepthList_4();
        driver.createList(root);
        driver.printList(root.left.left);

    }
}
