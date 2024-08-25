public class maze_paths {
    public static int path=0;
    public static void main(String args[]){
        int m=3,n=3;
        int result=calculatePaths(0,0,m,n);
        System.out.println(result);
    }   
    public static int calculatePaths(int i,int j, int m , int n)
    {
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n || j==m){
            return 0;
        }
        int down=calculatePaths(i+1, j, m, n);
        int right=calculatePaths(i, j+1, m, n);
        return down+right;

    }

    }
