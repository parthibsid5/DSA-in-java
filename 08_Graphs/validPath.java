import java.util.*;

class validPath {
    public static void main(String args[]) {
        int n = 3, src = 0, dest = 2;
        int edges[][] = {
                { 0, 1 },
                { 1, 2 },
                { 2, 0 }
        };
        Solution1 sol = new Solution1();
        boolean res = sol.validPath(n, edges, src, dest);
        System.out.println(res);
    }
}

// using array only, but TLE (Time Limit Exceeded)
class Solution1 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        java.util.Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[n];
        q.add(source);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (curr == destination) {
                return true;
            }
            if (!visited[curr]) {
                visited[curr] = true;
                for (int edge[] : edges) {
                    int src = edge[0];
                    int dest = edge[1];
                    if (src == curr && !visited[dest]) {
                        q.add(dest);
                    } else if (dest == curr && !visited[src]) {
                        q.add(dest);
                    }
                }
            }
        }

        return false;
    }
}

class Solution2 {
    // making adjacency list from array
    public boolean validPath(int n, int[][] edges, int source, int destination){
        List<List<Integer>> graph=new ArrayList<>();
        // initialization of the list
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int edge[] : edges){
            int src=edge[0];
            int dest=edge[1];
            graph.get(src).add(dest);
            graph.get(dest).add(src); //since the graph is undirected
        }

        java.util.Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[n];
        q.add(source);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(curr==destination){
                return true;
            }
                visited[curr]=true;
                for(int e: graph.get(curr)){
                    if(!visited[e]){
                        visited[e]=true;
                        q.add(e);
                    }
                }
            }
        return false;
    }
}