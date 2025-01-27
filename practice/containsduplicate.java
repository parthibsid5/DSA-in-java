import java.util.Hashtable;
import java.util.Arrays;
public class containsduplicate extends Solution{
    public static void main(String args[]){
        Solution sol=new Solution();
        int arr[]={3,3};
        System.out.print(sol.containsDuplicate(arr));
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer,Integer> table=new Hashtable<>();
        for(int x:nums){
            if(table.containsKey(x)){
                table.put(x,table.get(x)+1);
                if(table.get(x)>=2){
                    return true;
                }
            }
            else{
                table.put(x,1);
            }
        }
        return false;

    }
}

class Solution2{
    public boolean containsDuplicate(int nums[]){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}