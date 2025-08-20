public class validPalindrom {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        Solution sp=new Solution();
        System.out.println(sp.isPalindrome(s));
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        String strs=s.toLowerCase().trim();
        System.out.println(strs);
        int l=0,r=strs.length()-1;
        while(l<r){
             if (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
                System.out.println("1");
                continue;
            }
            if (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
                System.out.println("1");
                continue;
            }
            if(strs.charAt(l)!=strs.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
