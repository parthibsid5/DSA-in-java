import java.util.*;

class commonAnsestor{
 static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    class Solution{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            for(int i=0;i<T;i++){
                int N=sc.nextInt();
                int root[]=new int[N];
                for(int j=0;j<N;j++){
                    root[j]=sc.nextInt();
                }
            }

        }
    }
}