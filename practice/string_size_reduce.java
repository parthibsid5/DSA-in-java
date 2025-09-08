import java.util.*;
public class string_size_reduce {
    public static void main(String args[]){
        String str="aabbbbeeeeffggg";
        StringBuilder temp=new StringBuilder("");
        HashMap<Character, Integer> map=new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        
        for(char ch: map.keySet()){
            temp.append(ch);
            temp.append(map.get(ch));
        }
        // System.out.println(temp);\
        solver(str);
    }
    public static void solver(String str){
        int count=1;
        StringBuilder temp = new StringBuilder();
        int n=str.length();
        for(int i=1;i<=n;i++){
            if(i<str.length() && str.charAt(i)==str.charAt(i-1)){
                count++;
            }
            else{
                temp.append(str.charAt(i-1));
                temp.append(count);
                count=1;
            }
        }
        System.out.println(temp);
    }
}
