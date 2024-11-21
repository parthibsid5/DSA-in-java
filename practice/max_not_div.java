// Given an array a
// , find the length of its longest subarray such that the sum of its elements isn't divisible by x
// , or determine that such subarray doesn't exist.
import java.util.*;
public class max_not_div {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        int x=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        if(arraySum(a)%x!=0){
            if(max<a.length){
                max=a.length;
            }
            
        }
        
    }
    public static void compare(int a[]){

    }
    public static int arraySum(int arr[]){
        int S=0;
        for(int i=0;i<arr.length;i++){
            S+=arr[i];
        }
        return S;
    }
}
