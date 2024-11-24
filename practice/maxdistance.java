public class maxdistance {
    public static void main(String args[]){
        String s="geek for geeks";
        char x='g';
        char ch[]=s.toCharArray();
        int f=s.indexOf(x),c=0;
        if(f>=0){
            for(int i=f;i<s.length();i++){
                if(ch[i]!=' ' && ch[i]!=x){
                    c++;
                    System.out.println(ch[i]);
                }
            }
            System.out.println(c>0?c:-1);
        }
        else{
            System.out.println(-1);
        }
    }
}
