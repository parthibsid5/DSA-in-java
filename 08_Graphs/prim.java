import java.util.*;
public class prim {
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
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        // graph[1].add(new Edge(1, 3, 40));
        graph[1].add(new Edge(1, 0, 10));

        // graph[2].add(new Edge(2, 3 , 50));
        // graph[2].add(new Edge(2, 0 , 15));

        graph[3].add(new Edge(3, 1, 40));
        // graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 2, 50));
    }

    public static class Pair implements Comparable<Pair>{
        int node,cost;
        Pair(int node,int cost){
            this.node=node;
            this.cost=cost;
        }
        @Override
        // must not be static 
        public int compareTo(Pair p2){
            return this.cost-p2.cost; //ascending sort

            // return p2.dist-this.dist; //descending sort
        }
        
    }
    public static void main(String args[]){
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        findMst(graph,v);
    }
    public static void findMst(ArrayList<Edge>graph[],int l){
        int c=0;
        int v=l;
        ArrayList<Integer> res=new ArrayList<>();

        PriorityQueue <Pair> pq=new PriorityQueue<>();
        boolean visited[]=new boolean[v];
        pq.add(new Pair(0,0));
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            // System.out.println(curr.node+"  "+curr.cost);
            if(!visited[curr.node]){
                visited[curr.node]=true;
                c+=curr.cost; // to find the minimum cost 
                res.add(curr.cost); // to get the weights
                //         int m=Integer.MAX_VALUE,n=0;   
                        for(int i=0;i<graph[curr.node].size();i++){
                            Edge e=graph[curr.node].get(i);
                            
                            if(!visited[e.dest]) pq.add(new Pair(e.dest,e.wt));
                        }
                }
            }
        for(int r: res){
            System.out.println(r);
        }
        System.out.println(c);
    }
}
