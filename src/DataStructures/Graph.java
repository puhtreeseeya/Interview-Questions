package DataStructures;

public class Graph {
    public Vertex[] adjList = new Vertex[10];

    public Graph() {
        Vertex[] adjList = new Vertex[10];
        for(int v=0; v < adjList.length; v++) {
            Vertex vert = new Vertex(v, null);
            this.adjList[v] = vert;
        }
    }

    public void addNeighbor(int v, int nbr) {
        Neighbor neigh = new Neighbor(nbr, adjList[v].next);
        adjList[v].next = neigh;
    }

    public void print() {
        for(int v=0; v<adjList.length; v++) {
            System.out.print(adjList[v].id);
            for(Neighbor nbr = adjList[v].next; nbr != null; nbr=nbr.next) {
                System.out.print(" ----> " + adjList[nbr.vertexNum].id);
            }
            System.out.println();
        }
    }


}