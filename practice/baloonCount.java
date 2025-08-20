import java.util.*;
public class baloonCount {
    public static void main(String[] args) {
        Solution sol=new Solution();
        String str="nlaebolko";
        int x=sol.maxNumberOfBalloons(str);
        System.out.println(x);
    }
}
class Solution {
    public int maxNumberOfBalloons(String text) {
        String key="balon";

        HashMap<Character, Integer> freMap=new HashMap<>();
        for(int i=0;i<text.length();i++){
            // if()
            if( !freMap.containsKey(text.charAt(i))){
                freMap.put(text.charAt(i),0);
            }
                freMap.put(text.charAt(i),(freMap.get(text.charAt(i))+1));
        }


        int result=0,min=Integer.MAX_VALUE;
        for(int i=0;i<key.length();i++){
            if(freMap.getOrDefault('l',0)+freMap.getOrDefault('o',0)== (1+ freMap.getOrDefault('a',0)+freMap.getOrDefault('b',0) ))
            {
                result=freMap.getOrDefault(key.charAt(i),0);
                min=Math.min(result,min);
            }
            else{
                min=0;
                return min;
            }
        }
        return min;
    }
}