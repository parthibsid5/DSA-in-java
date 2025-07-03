import java.util.*;
class topoSort {
   static class Edge{
        int src,dest;
        Edge(int src, int dest){
            this.src=src;
            this.dest=dest;
        }
    }    
    public static void createGraph (ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[3].add(new Edge(3,1));

        graph[2].add(new Edge(2,3));
    }

    // Tx : O(V+E)
    public static void topologicalSort(ArrayList<Edge> graph[], boolean visited[],int curr, Stack<Integer> stack){
        visited[curr]=true;
        for(Edge e: graph[curr]){
            if(!visited[e.dest]){
                topologicalSort(graph, visited, e.dest, stack);
            }
        }
        stack.push(curr);
    }

    public static void main(String args[]){
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        Stack<Integer> stack=new Stack<>();
        boolean visited[]=new boolean[v];
        createGraph(graph);
        for(int i=0;i<v;i++){
            if(!visited[i]){
                topologicalSort(graph, visited, i, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
