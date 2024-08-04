public class fibonacci {
    public static void  fibo(int a, int b,int n){
        if(n==0){
            return;
        }
        int c=0;
        c=a+b;
        System.out.print(c+" ");
        fibo(b, c, n-1);

    }
    public static void main(String args[]){
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=9;
        fibo(a,b, n-2);
    }

}

