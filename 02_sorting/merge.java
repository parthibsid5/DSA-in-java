public class merge {
   public static int mid;
    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr, 0,n-1);
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);
         }
         }
    public static void divide(int arr[],int s,int e){
        if(s>=e){ 
            return;
        }
        mid= s+ (e-s)/2;
        divide(arr, s, mid);
        divide(arr, mid+1, e);

        conquer(arr,s,mid,e);
    }
    public static void conquer(int arr[],int s,int mid,int e){
        int merged[]=new int[e-s+1];
        int idx1=s;
        int idx2=mid;
        int x=0;
        while(idx1<=mid && idx2<=e){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<e){
        merged[x++]=arr[idx2++];
    }

    for(int i=0,j=s;i<merged.length;i++,j++){
        arr[j]=merged[i];
    }

    }
}
 