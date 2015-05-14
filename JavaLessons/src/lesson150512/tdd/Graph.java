package lesson150512.tdd;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    List<Integer>[] edges;
    int edgeCount;

    public Graph(final int vertices) {
        if (vertices <= 0){
            throw new IllegalArgumentException("Can't be zero");
        }
        edges = new List[vertices];
        for (int i = 0; i < edges.length; i++) {
            edges[i] = new ArrayList<Integer>();
        }
    }

    public void addEdge(final int from, final int to) {
        if (from >= edges.length || to >= edges.length) {
            throw new IllegalArgumentException();
        }
        if (edges[from] == null) {
            edges[from] = new ArrayList<Integer>();
        }
        edges[from].add(to);
        edges[to].add(from);
        edgeCount++;
    }

    public int getEdges() {
        return edgeCount;
    }

    public boolean connected(int i, int j) {
        return edges[i].contains(j);
    }
    
    //public Iterable<Integer> adjacent

};
