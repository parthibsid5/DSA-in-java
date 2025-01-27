public class twoSum {
    public static void main(String[] args) {
        colutionBruteForce sol = new colutionBruteForce();
        int arr[] = {0,4,3,0};
        sol.twoSum(arr, 0);
    }
}

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

class solutionEfficint{
    void twoSum(int[] nums, int target){
        int arr[]=new int[2];
    }
}