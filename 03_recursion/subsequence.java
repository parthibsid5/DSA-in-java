/* 
                  a                         _
               /     \                   /     \ 
             ab       a_             _b           __
          /    \     /   \        /     \       /     \
        abc   ab_   a_c   a__    _bc    _b_    __c   ___

*/
// TC=O(2^n)



import java.util.HashSet;

public class subsequence {
    public static void random_all_subseq(String str, int idx, String newstr){
      if(idx==str.length()){
        System.out.println(newstr);
        return;
      }
      char currChar=str.charAt(idx);
      random_all_subseq(str,idx+1,newstr+currChar);

      random_all_subseq(str, idx+1, newstr);
    }

    public static void unique_subs(String str,int idx, String newstr, HashSet<String> set){
      if(idx==str.length()){
        if(set.contains(newstr)){
          return;
        }
        else{
          System.out.println(newstr);
          set.add(newstr);
          return;
        }
      }
      char currchar=str.charAt(idx);
      unique_subs(str, idx+1, newstr, set);

      unique_subs(str, idx+1, newstr+currchar, set);


    }
    public static void main(String args[]){
      random_all_subseq("aaa", 0, "");

      String str="aaa";
      HashSet<String> set= new HashSet<>();
      unique_subs(str, 0 , "", set);

    }
} 
