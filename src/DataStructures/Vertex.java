package DataStructures;

public class Vertex {
    public int id;
    public Neighbor next;
    Vertex(int id, Neighbor neighbors) {
        this.id = id;
        this.next = neighbors;
    }
}