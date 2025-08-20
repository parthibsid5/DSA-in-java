// 1539. Kth Missing Positive Number
class kth_missing {
    public static void main(String args[]){
        kth_missing km=new kth_missing();
        int arr[]={2,3,4,7,11};
        findKthPositive(arr,5);
        // System.out.println(x);
    }
    public static void findKthPositive(int[] arr, int k) {
        int rem[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rem[i]=arr[i]-(i+1);
            // System.out.println(rem[i]);
        }
        int res=0;
        int l=0,h=rem.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(k>rem[l]){
                l=mid+1;
                System.out.println(l);
            }
            if(k<rem[l]){
                h=mid;
                System.out.println(h);
            }
            if(mid==l && mid==h){
                res=arr[l-1]+(k-rem[l-1]);
                System.out.println(res);
            }
        }
    // return res;
    }
}

