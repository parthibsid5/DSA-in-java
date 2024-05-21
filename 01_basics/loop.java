import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
    
    // sum of all numbers from zero untill the user accepted number is reached
    System.out.print("Enter number : ");
    int num=sc.nextInt();
    int sum=0;
    for(int i=0;i<=num;i++){
        sum+=i;
    }
    System.out.println("The required sum is "+sum);
    }
}
