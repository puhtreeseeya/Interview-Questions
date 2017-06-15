package DataStructures;

public class SuccessorNode {
    public int data;
    public SuccessorNode left, right, parent;

    public SuccessorNode(int data) {
        this.data = data;
        left = right = parent = null;
    }
}