import java.util.*;

public class string {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String user="Ironman";
        String assistant="Jarvis";
        System.out.println("Enter command : ");
        // String command=sc.nextLine();
        // System.out.println("Hello "+user+" I am "+assistant+" hope you are fine !.. Tell me the command : "+command);
        System.out.println(user + assistant);
        System.out.println(user.length());
        System.out.println(user.charAt(5));
        System.out.println(user.compareTo(assistant)>0?"bigger":"smaller");
        System.out.println("hello".compareTo("Hello"));
        
        // comparison bases on lexicographically and ascii codes

        String urlName="https://www.google.com";
        System.out.println(urlName.substring(5,12));





    }
}
