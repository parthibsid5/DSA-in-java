public class occurence {
    public static void main(String args[]) {
        int arr[]={5,7,7,8,8,10},target=7,n;
        n=arr.length;
       int ub=upperbound(arr,n,target);
       int lb=lowerbound(arr,n,target);
    //    we cannot give this condition first i.e arr[lb]!=target... since out of bounds exception
       if(lb==n || arr[lb]!=target){
        System.out.println("{-1,-1}");
       }
       else{
           System.out.println("{"+lb +" "+ (ub-1)+"}");
       }
    }   
    public static int upperbound(int nums[],int n, int target){
        int l=0,h=n-1,ans=n;
        while(h>=l){
            int mid=l+ (h-l)/2 ;
            if(nums[mid]>target){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    public static int lowerbound(int nums[],int n, int target){
        int l=0,h=n-1,ans=n;
        while(h>=l){
            int mid=l+ (h-l)/2 ;
            if(nums[mid]>=target){
                ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}
