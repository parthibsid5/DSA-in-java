import java.util.*;
public class problems {
    public static void main(String args[]){

        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==0 || i==4 || j==0 || j==4){
                    // System.out.print("* ");
                }
                else{
                    // System.out.print("  ");
                }
            }
            // System.out.println();
        }
        count_numbers();
    }
    public static void count_numbers(){
        Scanner sc=new Scanner(System.in);
        int posCount=0,negCount=0,zeroCount=0;
        System.out.println("Enter positive negative or zero for the counting and 'exit' to exit from the sequence");
        while(true)
        {
            String input=sc.nextLine();
            if((input.trim()).equalsIgnoreCase("exit")){
                break;
            }
            else{
                int num=Integer.parseInt(input);
                if(num>0){posCount+=1;}
                else if(num<0){negCount+=1;}
                else{zeroCount+=1;}
            }
        }
        System.out.println("Pos : "+posCount+"\nNeg : "+negCount+"\nZero : "+zeroCount);

    }
}
