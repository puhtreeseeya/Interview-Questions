package Chapter_4;

/* Given a directed graph, design an algorithm to find out whether there is a route between
two nodes. */

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

    boolean BFSPath(int start, int end) {
        for(Neighbor nbr = adjList[start].next; nbr != null; nbr=nbr.next) {
            if (nbr.vertexNum == end) {
                return true;
            } else {
                return BFSPath(nbr.vertexNum, end);
            }
        }
        return false;
    }

    boolean DFSUtil(boolean[] visited, int start, int end) {
        visited[start] = true;
        if(start == end) {
            return true;
        } else {
            for(Neighbor nbr = adjList[start].next; nbr != null; nbr=nbr.next) {
                if(visited[nbr.vertexNum] == false) {
                    return DFSUtil(visited, nbr.vertexNum, end);
                }
            }
        }
        return false;
    }

    boolean DFSPath(int start, int end) {
        boolean[] visited = new boolean[10];
        return DFSUtil(visited, start, end);
    }
}

public class HasPath_2 {

    public static void main(String[] args) {
        Graph digraph = new Graph();
        digraph.addNeighbor(0,1);
        digraph.addNeighbor(0,2);
        digraph.addNeighbor(1,3);
        digraph.addNeighbor(3,2);
        digraph.print();
        System.out.println(digraph.BFSPath(1,0));
        System.out.println(digraph.DFSPath(1,0));
    }
}
