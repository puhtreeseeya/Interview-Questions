package Chapter_4;

class Neighbor {
    public int vertexNum;
    public Neighbor next;
    public Neighbor(int vnum, Neighbor nbr) {
        this.vertexNum = vnum;
        next = nbr;
    }
}

class Vertex {
    int id;
    Neighbor next;
    Vertex(int id, Neighbor neighbors) {
        this.id = id;
        this.next = neighbors;
    }
}

class Graph {
    Vertex[] adjList = new Vertex[10];

    public Graph() {
        for(int v=0; v < adjList.length; v++) {
            Vertex vert = new Vertex(v, null);
            this.adjList[v] = vert;
        }
    }

    void addNeighbor(int v, int nbr) {
        Neighbor neigh = new Neighbor(nbr, adjList[v].next);
        adjList[v].next = neigh;
    }

    void print() {
        for(int v=0; v<adjList.length; v++) {
            System.out.print(adjList[v].id);
            for(Neighbor nbr = adjList[v].next; nbr != null; nbr=nbr.next) {
                System.out.print(" ----> " + adjList[nbr.vertexNum].id);
            }
            System.out.println();
        }
    }

    boolean hasPath(int start, int end) {
        for(Neighbor nbr = adjList[start].next; nbr != null; nbr=nbr.next) {
            if (nbr.vertexNum == end) {
                return true;
            } else {
                return hasPath(nbr.vertexNum, end);
            }
        }
        return false;
    }
}

public class BFS_2 {

    public static void main(String[] args) {
        Graph digraph = new Graph();
        digraph.addNeighbor(0,1);
        digraph.addNeighbor(0,2);
        digraph.addNeighbor(3,0);
        digraph.addNeighbor(1,3);
        digraph.print();
        System.out.println(digraph.hasPath(3,2));

    }
}
