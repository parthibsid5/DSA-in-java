public class max_consec_ones {
    public static void main(String args[]){
        Solution sol=new Solution();
        int nums[]={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int x=sol.longestOnes(nums, k);
        System.out.println(x);
    }
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=-1,w=0,zero=0,maxw=0;
        for(int num :nums){
            r++;
            if(num==0){
                zero++;
            }
            while(zero>k){
                if(nums[l]==0){  
                  zero--;
                }
                l++;
            }
            w=r-l+1;
            maxw=Math.max(maxw,w);
            // System.out.println(r+" -- "+l);
        }
        return maxw;
    }
}
