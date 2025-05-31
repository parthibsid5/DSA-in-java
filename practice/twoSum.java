public class twoSum {
    public static void main(String[] args) {
        colutionBruteForce sol = new colutionBruteForce();
        int arr[] = {1,5,10,11,15,25};
        // sol.twoSum(arr, 0);

        solutionEfficint solEff=new solutionEfficint();
        solEff.twoSum(arr, 21);
    }
}
// the solution is using an extra array so extra space, same with hashmap too
class colutionBruteForce {
    public void twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}
}
// suppose the same problem but the array is given in non-decreasing order!
// we have to make use of this ..
class solutionEfficint{
    int[] twoSum(int[] numbers, int target){
        int l=0,r=numbers.length-1,sum;
        while(l<r){
            sum=numbers[l]+numbers[r];
            if(sum==target){
                break;
            }
            else if(sum>target){
                r--;
            }
            else{
                l++;
            }
        }
        return new int[]{l+1,r+1};
        }
}