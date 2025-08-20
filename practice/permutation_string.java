import java.util.Arrays;
public class permutation_string {
    public static void main(String args[]){
        Solution sol=new Solution();
        boolean res=sol.checkInclusion("ab", "ediabc");
        System.out.println(res);
    }
}
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int count1[]=new int[26];
        int count2[]=new int[26];
        for(int i=0;i<s1.length();i++){
            int pos1=s1.charAt(i)-'a';
            int pos2=s2.charAt(i)-'a';
            count1[pos1]+=1;
            count2[pos2]+=1;
        }
        if(Arrays.equals(count1,count2)){
            return true;
        }
        int l=0,r=s1.length();
        while(r<s2.length()){
            int pos1=(s2.charAt(l)-'a');
            int pos2=(s2.charAt(r)-'a');
            count2[pos1]-=1;
            count2[pos2]+=1;
            // System.out.println("ho");
            if(Arrays.equals(count1,count2)){
                return true;
            }
            l++;
            r++;
        }
        return false;
    }
}
