class string_pattern_token {
    public static void main(String args[]){
        String strArr[]={"coderbyte","5"};
        String str=strArr[0];
        int num=Integer.valueOf(strArr[1])-1;
        int count=0;
        int n=str.length();
        int a=0,b=n;
        String result="";
        while(count<n){
            for(int i=a;i<=b;i+=num){
                result+=str.charAt(i);
                count++;
            }
            a+=1;
            b-=1;
            num--;
        }
        System.out.println(result);
    }    
}
