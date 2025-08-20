import java.util.HashSet;
public class longest_cons_subseq {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = {0};
        //            0 012345678
        // sol.longestConsecutive(arr);
        int res = sol.longestConsecutive(arr);
        System.out.println(res);
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        // since there are duplicates so we need to get rid of the duplicated so that we can count effectivly!

        // so we will convert to hashset so that only unique entries exist!

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int l=0,counter;
        for(int num :set){
            int prev=num-1; //99
            int next=num+1; //101
            if(!(set.contains(prev))){
                counter=1;
                while(set.contains(next)){
                    counter++;
                    next+=1;
                }
                l=Math.max(counter, l);
            }
        }
        return l;
    }
}
