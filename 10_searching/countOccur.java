public class countOccur {
    public static void main(String args[]){
        int arr[]={1,1,1,2,2,3,3},n=7,x=1;
        int occ=upperBound(arr, n, x)- lowerBound(arr, n, x);
        System.out.println(occ + " "+upperBound(arr, n, x)+" "+lowerBound(arr, n, x));
    }
    public static int upperBound(int nums[],int n, int x){
        int first =n;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+ (h-l)/2;
            if(nums[mid]>x){
                first=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return first;
    }
    public static int lowerBound(int nums[],int n, int x){
        int last =n;
        int l=0,h=n-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>=x){
                last=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return last;
    }
}
