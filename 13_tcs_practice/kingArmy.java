import java.util.*;
class kingArmy{
    static int ctr=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int end=sc.nextInt();

        int a[]=new int[n];
        a[0]=1;

        solver(1,n,end,r,a);
        System.out.println(ctr);
    }
    public static void solver(int pos,int n, int e,int r,int arr[]){
        if(pos==n){
            if(arr[n-1]==e) ctr++;
            return;
        }

        for(int i=1;i<=r;i++){
            if(arr[pos-1]!=i){
                arr[pos]=i;
                solver(pos+1, n, e,r,arr);
            }
        }

    }
}