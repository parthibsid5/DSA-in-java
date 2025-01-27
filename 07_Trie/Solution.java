class Solution {
    static class Node{
        Node children[];
        boolean eow;
        Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }
    public String longestCommonPrefix(String[] strs) {
        for(int i=0;i<strs.length;i++){
            insert(strs[i]);
        }

        Node curr=root;
        StringBuilder s=new StringBuilder();
        int c=0;
        for(int i=0;i<26;i++){
            if(curr.children[i]!=null){
                
            }
                if(curr.children[i].eow && c=-1){
                    break;
                }
            }
            curr=curr.children[c];
        } 
        return s.toString();
    }
    public static void main(String args[]){
        Solution sol=new Solution();
        String strs[]={"flower","flow","flight"};
        String ans=sol.longestCommonPrefix(strs);
        System.out.println(ans);
    }
}