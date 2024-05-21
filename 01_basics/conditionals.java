import java.util.Scanner;

public class conditionals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 for if else...");
        System.out.println("Enter 2 for ternary");
        int switchVar = sc.nextInt();
        switch (switchVar) {
            case 1:
                age_vote();
                break;
            case 2:
                even_odd();
                break;
                default:System.out.println("Invalid input");
        }
    }

    public static void age_vote() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Can vote");
        } else if (age >= 0 && age < 18) {
            System.out.println("Can't vote");
        } else {
            System.out.println("Invalid age input");
        }
    }
    public static void even_odd(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :");
        int num=sc.nextInt();
        String output=num%2==0?"Even number":num==1?"Neither odd or even":"Odd number";
        System.out.println("Result : "+output);
    }
}
