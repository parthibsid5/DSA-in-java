// longest word with all prefixes

public class longestWord {
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
            Node curr= root;
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
   
        static String str = "";

        public static void longestword(Node root, StringBuilder temp) {
            if (root == null) {
                return;
            }
            for (int i = 0; i < 26; i++) {
                if (root.children[i] != null && root.children[i].eow == true) {
                    temp.append((char) (i+ 'a'));

                    // give this condition for the lexical larger one 
                    // (temp.length() == str.length() && temp.toString().compareTo(str) > 0)

                    if (temp.length() > str.length()) {
                        str = temp.toString();
                    }
                    longestword(root.children[i], temp);
                    temp.deleteCharAt(temp.length() - 1);
                }
            }
        }

            public static void main(String args[]){
                String words[]={"a","ap","app","appl","apple","apply","banana"};
                for(int i=0;i<words.length;i++){
                    insert(words[i]);
                }
                StringBuilder temp=new StringBuilder("");
                longestword(root,temp);
                System.out.println(str);
            }
}
