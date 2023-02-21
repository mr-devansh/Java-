package Graphs;
import java.util.*;
public class hasPath {
    static class edge{
        int src;
        int dest;
        int wt;
        public edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static boolean bfs(ArrayList<edge>[] graph, int src, int dest, boolean visited[]){
        if (src==dest) {
            return true;
        }
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            edge e = graph[src].get(i);
            if (!visited[e.dest]&&bfs(graph, e.dest, dest, visited)) {
                return true;
            }
        }
        return false;
    }
    static void createGraph(ArrayList<edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));

        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));

        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));

        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));

        graph[4].add(new edge(4, 2, 1) );
        graph[4].add(new edge(4, 3, 1) );
        graph[4].add(new edge(4, 5, 1) );

        graph[5].add(new edge(5, 3, 1) );
        graph[5].add(new edge(5, 4, 1) );
        graph[5].add(new edge(5, 6, 1) );

        graph[6].add(new edge(6, 5, 1) );
    }
    public static void main(String[] args) {
        int v = 7;
        ArrayList<edge>[] graph = new ArrayList[v];
        createGraph(graph);
        System.out.println(bfs(graph, 0, 6, new boolean[v])); 
    }
}
