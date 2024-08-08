class string_rev{
    public static void main(String args[]){
        String str="abcd";
        int l=str.length()-1;
        print_reverse(l, str);

    }
    public static void print_reverse(int i,String str){
        // if(i<0){
        //     return;
        // }
        if(i==0){
            System.out.println(str.charAt(i));
            return;
        }
        System.out.println(str.charAt(i));
        print_reverse(i-1, str);
    }
}