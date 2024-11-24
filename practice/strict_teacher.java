import java.util.Arrays;
import java.util.Scanner;
public class strict_teacher {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int teacher=sc.nextInt();
            int david=sc.nextInt();

            int b[]=new int[teacher];
            int q[]=new int[david];
            for(int i=0;i<teacher;i++){
                b[i]=sc.nextInt();
            }
            for(int i=0;i<david;i++){
                q[i]=sc.nextInt();
            }
            Arrays.sort(b);
            Arrays.sort(q);
        int dpos,mdis=0;
        for(int i=0;i<q.length;i++){
            dpos=q[i];
            if(dpos<b[0]&& dpos!=1){
                mdis=b[0]-1;
            }
            else if(dpos>b[teacher-1] && dpos!=teacher){
                mdis=n-b[teacher-1];
            }
            else if(dpos==1){
                mdis=b[0]-1;
            }
            else if(dpos==n){
                mdis=n-b[teacher-1];
            }
            else{
                for(int j=0;j<teacher-1;j++){
                    if(dpos>=b[j] && dpos<=b[j+1]){
                        mdis=Math.min(dpos-b[j], b[j+1]-dpos);
                    }
                }
            }
            System.out.println(mdis);
        }
    }
}
}
