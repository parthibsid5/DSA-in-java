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


        // graph[0].add(new Edge(0, 1, 2));

        // graph[1].add(new Edge(1, 0, 2));
        // graph[1].add(new Edge(1, 2, 2));

        // graph[2].add(new Edge(2, 1, 2));

        // graph[3].add(new Edge(3, 4, 2));

        // graph[4].add(new Edge(4, 3, 2));



        graph[0].add(new Edge(0, 2, 2));
        graph[1].add(new Edge(1, 0, 2));
        graph[2].add(new Edge(2, 3, 2));
        // graph[3].add(new Edge(3, 0, 2));
    }

    // public static void BFS(ArrayList<Edge> graph[], int v) {
    //     java.util.Queue<Integer> q = new LinkedList<>();
    //     boolean visited[] = new boolean[v];
    //     for (int i = 0; i < graph.length; i++) {
    //         visited[i] = false;
    //     }
    //     q.add(graph[0].get(0).src);
    //     while (!q.isEmpty()) {
    //         int e.dest =currov
    //             return true();
            
            
    //         if(visited[e.dest] && parent!=curr){
    //             return true;
    //         }    if (visited[curr] == false) {
    //             System.out.println(curr);
    //             visited[curr] = true;
    //             for (int i = 0; i < graph[curr].size(); i++) {
    //                 Edge e = graph[curr].get(i);
    //                 q.add(e.dest);
    //             }
    //         }
    //     }
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

    // O(v+e)
    public static void DFS(ArrayList<Edge> graph[],boolean dfs_visit[],int curr){
        // if(curr==0){
        //     return;
        // }
        System.out.println(curr);
        dfs_visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(dfs_visit[e.dest]==false){
                DFS(graph, dfs_visit, e.dest);
            }
        }
    }

    public static void DFS_disjoied(ArrayList<Edge> graph[],boolean dfs_dis_visit[],int curr){
        System.out.println(curr);
        dfs_dis_visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(dfs_dis_visit[curr]==false){
                DFS_disjoied(graph, dfs_dis_visit, e.dest);
            }
        }
        
    }


    // all paths from src to dest
    // O(v^v), very large time cx, good for smaler graphs  
    public static void printAllPath(ArrayList<Edge> graph[],boolean arr[],int curr,String path,int target){
        if(curr==target){
            System.out.println(path);
            return;
        }
        // path=path+curr;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(arr[e.dest]==false){
                arr[curr]=true;
                printAllPath(graph, arr, e.dest, path+e.dest, target);
                arr[curr]=false;
            }
        }

    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[],boolean visited[],boolean recursion[],int curr){
        visited[curr]=true;
        recursion[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visited[e.dest]){
                if(isCycleDirected(graph, visited,recursion, e.dest)){
                    return true;
                }
            }
            else if(recursion[e.dest]){
                 return true;
             }
        }
        recursion[curr]=false;
        return false;
    }


    public static boolean isCycleUndirected(ArrayList<Edge> graph[],boolean visited[],int curr,int parent){
        visited[curr]=true;
        for(Edge e : graph[curr]){
            if(!visited[e.dest]){
                if(isCycleUndirected(graph, visited, e.dest, curr)) {
                    return true;
                }   
            }
            if(visited[e.dest] && parent!=e.dest){
                return true;
            }
        }
        return false;
    }
    public static void main(String a[]) {
        int v = 7;
        // int v = 5;
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
        // boolean visit[] = new boolean[v];
        // int start = graph[0].get(0).src;
        // for(int i=0;i<v;i++){
            //     BFS_disjointed(graph, visit, i);            
            // }
            // boolean dfs_visit[] = new boolean[v];
            // DFS(graph, dfs_visit, 0);

            // dfs disjoined
            // boolean dfs_dis_visit[]=new boolean[v];
            // for(int i=0;i<v;i++){
            //     if(dfs_dis_visit[i]==false){
            //         DFS_disjoied(graph, dfs_dis_visit, i);
            //     }
            // }

            boolean arr[]=new boolean[v];
            String path="0";
            int target=5,src=0;
            // printAllPath(graph, arr, src, path, target);

            boolean visited[]=new boolean[v];
            boolean recursion[]=new boolean[v];
            boolean result=isCycleDirected(graph, visited,recursion,graph[0].get(0).src);
            System.out.println(result); 

            // cycle undirected check
            System.out.println(isCycleUndirected(graph, visited,0,-1));
    }
