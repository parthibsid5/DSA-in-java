import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;

public class localdatetime {
    public static void main(String args[]){
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        //current date and time


        // Difference between two dates
        LocalDate start=LocalDate.of(2003,11,2);

        LocalDate end=LocalDate.now();
        Period diff=Period.between(start,end);
        System.out.println(diff.getYears()+"years "+diff.getMonths()+"months "+diff.getDays()+"days ");
    }
}
