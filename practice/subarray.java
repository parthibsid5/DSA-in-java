
import java.util.*;
public class subarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={2,3,5,4,9};
        int p1=0,p2=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
        }
}
