import java .util.*;
public class parantheses {
    public static void main(String[] args) {
        Solution sol=new Solution();
        String str="({{{{}}}))";
        System.out.println(sol.isValid(str));
    }
}
class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> list=new ArrayList<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!(map.containsKey(ch))){
                list.add(ch);
            }
            else{
                if(list.contains(map.get(ch))){
                    System.out.println(list.get(list.size()-1));
                    list.remove(list.size()-1);
                }
                else{
                    return false;
                }
            }
            
    }
            if(list.size()==0){
                return true;
            }
            else{
                return false;
            }
}
}
