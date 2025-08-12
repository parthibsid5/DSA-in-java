import java.time.LocalTime;

public class localtime {
    public static void main(String args[]){
        LocalTime lt=LocalTime.now();
        System.out.println(lt);

        LocalTime findtime=LocalTime.of(14,2);
        System.out.println(findtime);
    }
}
