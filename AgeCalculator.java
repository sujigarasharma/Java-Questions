import java.time.*;
import java.util.*;

public class AgeCalculator {  
   public static void main(String[] args)
    {
	Scanner in =new Scanner(System.in);
        // date of birth
	System.out.print("\nEnter The Year : ");
        int y=in.nextInt();
	System.out.print("\nEnter The Month : ");
        int m=in.nextInt();
	System.out.print("\nEnter The Day : ");
        int d=in.nextInt();
        LocalDate pdate = LocalDate.of(y, m, d);
        // current date
        LocalDate now = LocalDate.now();
        // difference between current date and date of birth
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nHis Age is %d years, %d months and %d days.\n\n", 
     diff.getYears(), diff.getMonths(), diff.getDays());

     System.out.print("\nToday date is "+now);
   }
}
