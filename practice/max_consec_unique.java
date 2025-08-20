import java.util.*;
class max_consec_unique
{
    public static void main(String args[]){
        Solution sol=new Solution();
        String s="pwwkew";
        int x=sol.lengthOfLongestSubstring(s);
        System.out.println(x);
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0,r=-1,w,mw=0;
        for(char ch: s.toCharArray()){
            r++;
            if(set.contains(ch)){
                while(l<=r){
                    set.remove(l);
                    l++;
                    System.out.println("hi");
                }
            }
            set.add(ch);
            w=r-l+1;
            mw=Math.max(w,mw);
        }
        return mw;
    }
}