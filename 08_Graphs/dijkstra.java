import java.util.*;

class dijkstra {
    static class Edge{
        int src,dest,wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4 , 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    public static class Pair implements Comparable<Pair>{
        int node,dist;
        Pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
        @Override
        // must not be static 
        public int compareTo(Pair p2){
            return this.dist-p2.dist; //ascending sort

            // return p2.dist-this.dist; //descending sort
        }
        
    }
    // TC=O(E+ElogV)  the extra log v is due to the priority queue sorting
    
    public static void dijkstraAlgorithm(ArrayList<Edge> graph[],int src, int v){
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        int dist[]=new int[v];
        //initialized to infinity
        for(int i=0;i<v;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        // initialized to flase
        boolean visited[]=new boolean[v];
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!visited[curr.node]){
                visited[curr.node]=true;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e=graph[curr.node].get(i);
                    int t=e.dest;
                    int u=e.src;
                    if(dist[t]>e.wt+dist[u]){
                        dist[t]=e.wt+dist[u];
                    }
                    pq.add(new Pair(t,dist[t]));
                }
            }
        }
        for(int i=0;i<v;i++){
            System.out.println(dist[i]+" ");
        }
    }

    public static void main(String args[]){
        int v=6;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);

        dijkstraAlgorithm(graph, 0, v);

    }

}
