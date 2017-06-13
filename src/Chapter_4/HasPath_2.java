package Chapter_4;
import DataStructures.Graph;
import DataStructures.Neighbor;

/* Given a directed graph, design an algorithm to find out whether there is a route between
two nodes. */

public class HasPath_2 {
    public boolean BFSPath(Graph graph, int start, int end) {
        for(Neighbor nbr = graph.adjList[start].next; nbr != null; nbr=nbr.next) {
            if (nbr.vertexNum == end) {
                return true;
            } else {
                return BFSPath(graph, nbr.vertexNum, end);
            }
        }
        return false;
    }

    public boolean DFSUtil(Graph graph, boolean[] visited, int start, int end) {
        visited[start] = true;
        if(start == end) {
            return true;
        } else {
            for(Neighbor nbr = graph.adjList[start].next; nbr != null; nbr=nbr.next) {
                if(visited[nbr.vertexNum] == false) {
                    return DFSUtil(graph, visited, nbr.vertexNum, end);
                }
            }
        }
        return false;
    }

    public boolean DFSPath(Graph graph, int start, int end) {
        boolean[] visited = new boolean[10];
        return DFSUtil(graph, visited, start, end);
    }

    public static void main(String[] args) {
        HasPath_2 util = new HasPath_2();
        Graph digraph = new Graph();
        digraph.addNeighbor(0,1);
        digraph.addNeighbor(0,2);
        digraph.addNeighbor(1,3);
        digraph.addNeighbor(3,2);
        digraph.print();
        System.out.println(util.BFSPath(digraph, 3, 2));
        System.out.println(util.DFSPath(digraph, 1,0));
    }
}
