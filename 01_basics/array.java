import java.util.*;
public class array {
    public static void main(String srgs[]){
        Scanner sc=new Scanner(System.in);

        // int num =sc.nextInt();
        // int arr[]=new int[num];
        //  if num is nothing ..then the array is automatically initialized to 0 for this case
        // 0.0 for float , false for boolean, "" for string

        String heroes[]=new String[5];
        heroes[0]="Ironman";
        heroes[1]="Hulk";
        heroes[2]="Captain America";
        heroes[3]="Widow";
        heroes[4]="Spiderman";
        for(int i=0;i<5;i++){
        System.out.println(heroes[i]);
        }
        two_dim_array();
    }
    public static void two_dim_array(){
        Scanner sc=new Scanner(System.in);

    }
}
