
public class printNum {
    public static void main(String args[]){
       
        print_Num(1);
        //  System.out.println(print_Num(5));
    }

    public static void print_Num(int n){
        if(n>5){
            return ;
        }
        System.out.println(n);;
        print_Num(n+1);
    }
}
