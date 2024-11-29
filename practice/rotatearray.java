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
     
     rotatearray rt=new rotatearray();
     int a[]={2,3,6,5,2,5};
     int g=2,n2=a.length;
     g=g%n2; //for g>n2
     rotate(a, 0, g-1);   //rotate o-d
     rotate(a, g,n2-1);        //rotate d-n
     rotate(a,0,n2-1);  //rotate o-n
     
     System.out.println(Arrays.toString(a));
    }

    public static void rotate(int arr[], int start, int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
