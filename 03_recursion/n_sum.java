
public class n_sum {
    public static void main(String args[]){
        print_sum(1,5,0);
    }
    public static void print_sum(int i,int n,int sum){
        System.out.println("a");
        if(i==n){
            sum+=n;
            System.out.println(sum);
            return ;
        }
     sum+=i;
     print_sum(i+1, n, sum);
    }
}
