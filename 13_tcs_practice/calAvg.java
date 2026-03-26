import java.util.*;
class calAvg{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        String str;
        for(int i=0;i<n;i++){
            str=sc.next();
            arr[i]=Integer.parseInt(str);
            if(arr[i]<=0 || arr[i]>=100000){
                System.out.println("Errot: Invalid input");
                return;
            }
        }
        int count=0,sum=0;
        float avg;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                count+=1;
                sum+=arr[i];
            }
        }
        if(count==0){
            System.out.println("cant divide by 0"); 
            return;
        }
        avg=sum/count;
        System.out.println(avg);
        sc.close();
    }
}