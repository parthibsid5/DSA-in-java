public class uniqueSubstring {
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
    static int nCount=0;

    public static void insertWord(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
                nCount+=1;
                
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }

    // we can also count nodes using this way! ~ similar to trees!
    public static int c=0;
    public static int nodeCount(Node curr){
        if(curr==null){
            return 0;
        }
        for(int i=0;i<26;i++){
            if(curr.children[i]!=null){
                c=c+1;
                nodeCount(curr.children[i]);
            }
        }
        return c+1;
    }

    public static void main(String args[]){
        String input="apple";
        for(int i=0;i<input.length();i++){
            insertWord(input.substring(i));
        }

        System.out.println(nCount+1);
        // Node curr=root;
        // System.out.println(nodeCount(curr));

    }
}
