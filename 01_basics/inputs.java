import java.util.*;
public class inputs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String name=sc.nextLine();
        System.out.println("Your name is : "+name);
        System.out.println("Enter a, b respectively");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of a b is : "+sum);
        area();
    }
    public static void area(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius in cm :");
        int radius=sc.nextInt();
            double area=Math.PI*radius*radius;
            System.out.println("Area of the circle is : "+area+" cm squares");
    }
}
