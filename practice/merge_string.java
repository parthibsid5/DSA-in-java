class merge_string {
    public static void main(String args[]){
        String s1="hello";
        String s2="hi";
        StringBuilder str=new StringBuilder();
        int i=0,j=0;
        while(i<s1.length() && j<s2.length()){
            str.append(s1.charAt(i++)).append(s2.charAt(j++));
        }
        while(i<s1.length()){
            str.append(s1.charAt(i++));
        }
        while(j<s2.length()){
            str.append(s2.charAt(j++));
        }
        System.out.println(str.toString());
    }
}
