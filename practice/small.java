import java.util.*;

public class small {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        String n = sc.next();

        small sm=new small();
        sm.check(m, n);

        

    }
    public static void check(String m,String n){
        char []dig=m.toCharArray();
        Arrays.sort(dig);

        if(dig[0]=='0'){
            for(int i=0;i<dig.length;i++){
                if(dig[i]!='0'){
                    char temp=dig[0];
                    dig[0]=dig[i];
                    dig[i]=temp;
                    break;
                }
            }
        }

        String newstr=new String(dig);
        if(newstr.equals(n)){
            System.out.println("OK");
        }
        else{
            System.out.println("WRONG_ANSWER");
        }

    }
}
