import java.util.*;

class bellmanFord {
    static class Edge{
        int src,dest,weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
         for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    // TC=O(E.V)

    public static void bellmanFordAlgorithm(ArrayList<Edge> graph[],int src,int v) {
        int dist[]=new int[v];
        for(int i=0;i<v;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        for(int k=0;k<v-1;k++){
            for(int i=0;i<v;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e=graph[i].get(j);
                    int u=e.src;
                    int t=e.dest;
                    if(dist[u]!=Integer.MAX_VALUE && dist[t]>dist[u]+e.weight){
                        dist[t]=dist[u]+e.weight;
                    }
                }
            }
        }
        for(int l:dist){
            System.out.print(l+" ");
        }
    }

    public static void main(String args[]) {
        int v=5;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        bellmanFordAlgorithm(graph,0,v);
    }
}
