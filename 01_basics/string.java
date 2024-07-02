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

        // String newAppend=urlName.append("/feed");
        // Thenabove line would give an error since Strings are immutable

        //  till now we have learnt that whenever we alter the string then a new string gets created that is the original string is immutable 
        //  so we get to know that each times a string is altered a new temporary objects being created 
        // But 'S T R I N G  B U I L D E R' is a mutuable type of string ...means gets updated, it dosen't create new temporary objects at each modifications..

        StringBuilder sb=new StringBuilder("Avinash");
        System.out.println(sb);
        sb.append(" assistant");
        sb.insert(5, '@');
        sb.delete(5, 6);
        System.out.println(sb);




    }
}
