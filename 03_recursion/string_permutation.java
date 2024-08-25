class string_permutation{
    public static void main(String args[]){
        printPermutation("abc", "");
    }
    public static void printPermutation(String str, String permString){
        if(str.length()==0){
            System.out.println(permString);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            // permString=permString+ch;
            printPermutation(newStr, permString+ch);
            // permString="";
            // System.out.println();
        }   
        // System.out.print(permString+"\n");
    }
}