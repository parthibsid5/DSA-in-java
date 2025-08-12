import java.time.LocalDate;
public class localdate {
    public static void main(String args[]){
        LocalDate tdy=LocalDate.now();
        System.out.println(tdy);

        LocalDate bday=LocalDate.of(2000,2,5);
        System.out.println(bday);
    }
}
