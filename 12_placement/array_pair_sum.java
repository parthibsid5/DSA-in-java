import java.util.*;
class array_pair_sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<n;i+=2){
            sum+=arr[i];
        }
        if(n%2==0){
            System.out.println("sum is : "+sum);
        }
        else{
            System.out.println("sum is : "+sum+arr[n-1]);
        }
    }
}
