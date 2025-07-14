public class occurence {
    public static void main(String args[]) {
        int arr[]={5,7,7,8,8,10},target=11,n;
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


    // by only binary search
    int first=getFirst(arr, n, target);
    int last=getLast(arr, n, target);
    if(first ==-1) System.out.println("{-1,-1}");
    else System.out.println("{"+first+" "+last+"}");


    }

    //  TC=O(log n);
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


    // now if we want to use only binary search no upper and lower bound!
    public static int getFirst(int arr[],int n, int t){
        int first=-1;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+ (h-l)/2;
            if(arr[mid]==t){
                first=mid; 
                h=mid-1;
            }
            else if(arr[mid]<t){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return first;
    }
    public static int getLast(int arr[],int n, int t){
        int last=-1;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+ (h-l)/2;
            if(arr[mid]==t){
                last=mid; 
                l=mid+1;
            }
            else if(arr[mid]<t){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return last;
    }
}
