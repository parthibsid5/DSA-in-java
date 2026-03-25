import java.util.*;
class maxSumLessOrEquival{
    static int result=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,5,7};
        int mSum=9;
        int currsum=0;
        solver(arr,mSum,currsum,0);
        System.out.println(result);
    }
    public static void solver(int arr[],int m, int curr,int idx){
        if(curr>m) return;
        result=Math.max(result,curr);
        if(idx==arr.length) return;
        solver(arr,m,curr+arr[idx], idx+1);
        solver(arr,m,curr, idx+1);
    }
}