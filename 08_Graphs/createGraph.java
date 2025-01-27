import java.util.*;
class createGraph{
    static class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }
    public static void creategraph(ArrayList<Edge> graph[]){
        // since default they are null, we need to make them empty.
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        // manually adding
        graph[0].add(new Edge(0, 2));

        graph[0].add(new Edge(1, 2));
        graph[0].add(new Edge(1, 3));

        graph[0].add(new Edge(2, 0));
        graph[0].add(new Edge(2, 1));
        graph[0].add(new Edge(2, 3));

        graph[0].add(new Edge(3, 2));
        graph[0].add(new Edge(3, 2));

    }
    public static void main(String a[]){
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creategraph(graph); 
        for(int i=0;i<graph[2].size();i++){
            System.out.println(graph[i].get(i));
        }
    }
}