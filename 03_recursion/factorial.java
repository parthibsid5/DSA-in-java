class factorial{
    public static int cal_factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*cal_factorial(n-1);
        }
    }
    public static void main(String args[]){
        int fact=cal_factorial(6);
        System.out.println(fact);
    }
}