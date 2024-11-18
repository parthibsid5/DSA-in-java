import java.util.Arrays;

class rotatearray {
    public static void main(String args[]){
        int arr[]={2,3,6,8,1,4};
        int d=3;
        int n=arr.length;
        // we will use juggling method
     // gcd of n,d
     int gcd=1;
     for(int i=1;i<=n;i++){
        if(n%i==0 && d%i==0){
            gcd=i;
        }
     }
     for(int i=0;i<gcd;i++){
        int temp=arr[i];
        int j=i;
        while(true){
            int k=(j+d) % n;
            if(k==i) break;
            arr[j]=arr[k];
            j=k;
        }
        arr[j]=temp;
     }
     System.out.println(Arrays.toString(arr));
    }
}
