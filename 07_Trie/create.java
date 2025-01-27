import java.util.*;
public class create {
    static class Node{
        Node children[];
         boolean eow; 
        
        public Node(){
            children=new Node[26];//a-z
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root=new Node();

    public static void insert(String word){
        Node currNode=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            
            // if the idx children node dosen't contain a node array then it must be null ie not containing the char
            
            if(currNode.children[idx]==null){
                currNode.children[idx]=new Node();
                // System.out.println("tr");
            }
            if(i==word.length()-1){
                currNode.children[idx].eow=true;
            }
            currNode=currNode.children[idx];
        }
    }
    
    // Tx()
    public static boolean searchWord(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            Node node =curr.children[idx];
            if(node==null){
                return false;
            }
            // ctr++;
            if(i==word.length()-1 && node.eow==false){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }

    // QN: Given an input string and a dictionary of words, find out if the input string can be broken into a space separated sequence of dictionary words
    // words[]={"i","like","samsung","sam","mobile", "ice"}
    // key= "ilikesamsung"
    // OUTPUT: True

    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String fpart=key.substring(0, i);
            String spart=key.substring(i);
            if(searchWord(fpart) && wordBreak(spart)){
                return true;
            }
        }
        return false;
    }


    public static boolean startsWith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                System.out.println("in");
                return false;
            }
            curr=curr.children[idx];
        }
        System.out.println("out");
        return true;
    }


    public static void main(String args[]){

        // String words[]={"the", "a", "there", "their", "any"};
        // String wordbreakstr[]={"i","like","samsung","sam","mobile", "ice"};
                           
        String words[]={"apple","app","mango","man","women"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        // System.out.println(searchWord("there"));
        // System.out.println(searchWord("alpha"));
        // System.out.println(searchWord("an"));
        // System.out.println(root.children[1]);
        // System.out.println(searchWord("like"));
        
         System.out.println(startsWith("app"));



    }
}
