/*
we can also opt for non recursive approach.
TC=O(n)
 */


public class remove_duplicates {
    public static boolean map[]=new boolean[26];
    public static String removeDuplicate(String str, int i, String newString){
        if(i==str.length()){
            return newString;
        }
        char currChar=str.charAt(i);
        if(!map[currChar-'a']){
            newString+=currChar;
            map[currChar-'a']=true;
            return removeDuplicate(str, i+1, newString);
        }
        // else{
            return removeDuplicate(str, i+1, newString);
        // }

    }

    
    public static void main(String args[]){
        String str="abbccda";
        String result=removeDuplicate(str, 0, "");
        System.out.println(result);
    }
}
