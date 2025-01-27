import java.util.*;
class anagram {
    public static void main(String args[]){
        Solution sol=new Solution();
        boolean result=sol.isAnagram("anagram", "nagaram");
        System.out.println(result);
    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable <Character,Integer> table1=new Hashtable<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!table1.containsKey(ch)){
                table1.put(ch,1);
            }
            else{
                table1.put(ch,table1.get(ch)+1);
            }
        }
        // System.out.println(table1);
        for(int i=0;i<t.length();i++){
            char x=t.charAt(i);
            if(table1.containsKey(x)){
                if(table1.get(x)>1){
                    table1.put(x,table1.get(x)-1);
                }
                else{
                    table1.remove(x);
                }
            }
            else{
                // System.out.println(x);
                return false;
            }
        }
        if(table1.isEmpty()){
            return true;
        }
        else{
            return false;
        }

    }
}
