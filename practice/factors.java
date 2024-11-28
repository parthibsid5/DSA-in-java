public class factors {
    public static void main(String args[]){
        int n=28;
        int sqroot=(int)Math.sqrt(n);
        for(int i=1;i<=sqroot;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(n/i!=i){
                    System.out.print((n/i)+" ");
                }
            }
        }
    }
}
