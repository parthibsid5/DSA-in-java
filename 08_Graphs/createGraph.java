import java.util.*;

class createGraph {
    static class Edge {
        int src;
        int dest;
        int weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]) {
        // since default they are null, we need to make them empty.
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        // manually adding
        // graph[0].add(new Edge(0, 1, 2));
        // graph[0].add(new Edge(0, 2, 3));

        // graph[1].add(new Edge(1, 3, 10));

        // graph[2].add(new Edge(2, 4, 2));

        // graph[3].add(new Edge(3, 4, 0));
        // graph[3].add(new Edge(3, 5, -1));

        // graph[4].add(new Edge(4, 3, -1));
        // graph[4].add(new Edge(4, 5, -1));

        // graph[5].add(new Edge(5, 6, -10));

        // graph[6].add(new Edge(6, 5, 2));


        graph[0].add(new Edge(0, 1, 2));

        graph[1].add(new Edge(1, 0, 2));
        graph[1].add(new Edge(1, 2, 2));

        graph[2].add(new Edge(2, 1, 2));

        graph[3].add(new Edge(3, 4, 2));

        graph[4].add(new Edge(4, 3, 2));

    }

    public static void BFS(ArrayList<Edge> graph[], int v) {
        java.util.Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[v];
        for (int i = 0; i < graph.length; i++) {
            visited[i] = false;
        }
        q.add(graph[0].get(0).src);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (visited[curr] == false) {
                System.out.println(curr);
                visited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void BFS_disjointed(ArrayList<Edge> graph[], boolean visit[], int start) {
        java.util.Queue<Integer> q = new LinkedList<>();

        q.add(start);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(visit[curr]==false){
                System.out.println(curr);
                visit[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }

    }

    public static void main(String a[]) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                // System.out.println(graph[2].get(i).dest+" ");
                // System.out.println(e.src + "--->" + e.dest + ": " + e.weight);
            }
        }
        // BFS(graph,v);

        // bfs disjointed the disjointed algo can be used for both jointed . disjointed!
        boolean visit[] = new boolean[v];
        // int start = graph[0].get(0).src;
        for(int i=0;i<v;i++){
            BFS_disjointed(graph, visit, i);            
        }
    }
}