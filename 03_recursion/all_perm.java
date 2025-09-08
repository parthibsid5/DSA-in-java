public class all_perm {
    public static void main(String args[]){
        String str="ABC",permStr="";
        find_all_perm(str, permStr);
    }
    public static void find_all_perm(String str,String permStr){
        if(str.length()==0){
            System.out.println(permStr);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newstr=str.substring(0, i)+ str.substring(i+1);

            find_all_perm(newstr, permStr+ch);
        }
    }
}

