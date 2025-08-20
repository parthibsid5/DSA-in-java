import java.util.*;
public class threeSum {
    public static void main(String[] args) {
        
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        int l=0,r=1,size=nums.length;
        while(l!=size-2){
            while(r!=size-1){
                for(int i=r+1;i<nums.length;i++){
                    if(nums[l]+nums[r]+nums[i]==0){
                        list.add(Arrays.asList(nums[l], nums[r], nums[i]));
                    }
                }
                r++;
            }
            l++;
        }
        return list;
    }
}