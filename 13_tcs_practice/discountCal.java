import java.util.*;
class discountCal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double final_amount=0;
        int amount=sc.nextInt();
            if(amount<1000){
                final_amount=amount- 0.05*amount;}
            else if(amount>=1000 && amount<5000){
                final_amount=amount- amount*0.1;
            }
            else if(amount>=5000){
                final_amount=amount-amount*0.15;}
            else{
                System.out.println("error");
            }
            double roundOff = Math.round(final_amount*100)/100;
            System.out.println(roundOff);
    }
}