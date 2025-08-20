import java.util.*;
public class groupAnagrams {
    public static void main(String[] args) {
        Solution sol=new Solution();
        // String str[]={""};
        // sol.groupAnagrams(str);
        
        Solution2 col2=new Solution2();
        String strs[]={"eat","tan","ate","tea","nat","bat"};
        col2.groupAnagrams(strs);

    }
}
// tx: 
//  sorting takes  O(k log k) ; k=length of string
// for n strings Tx: o(n. k log k) so iys too much !!
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==1){
            return new ArrayList<>(Arrays.asList(new ArrayList<>(Arrays.asList(strs[0]))));
        }
        List<List<String>> list=new ArrayList<List<String>>();
        HashMap<String ,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            String sorted=sort(str);

            if(map.containsKey(sorted)){
                map.get(sorted).add(str);
            }
            else{
                map.put(sorted, new ArrayList<>(Arrays.asList(str)));
            }
        }
        for ( String e: map.keySet()){
            list.add(map.get(e));
        }
        return list;
    }
    public String sort(String s){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String newstr=new String(ch);
        return newstr;
    }
}

// we will not store the strings in a map instead count the frequencies of those
class Solution2{
    public  List<List<String>> groupAnagrams(String strs[]){
        List<List<String>> list=new ArrayList<>();
        HashMap<String ,List<String>> map=new HashMap<>();
        for(String str:strs){
            String freq_count=getFrequency(str);
            if(! map.containsKey(freq_count)){
                map.put(freq_count, new ArrayList<>());
            }
            map.get(freq_count).add(str);
        }
        // list.add(new ArrayList(map.values()));
        list.addAll(map.values());

        return list;
    }
    public String getFrequency(String s){
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        return Arrays.toString(arr);
    }
}