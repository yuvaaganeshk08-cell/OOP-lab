import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;
public class DateNTime {
    public static void main(String[] args){

        LocalDate date = LocalDate.now(); // Gives current date
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now(); //Gives both Date and Time
        System.out.println(dateTime);

        Instant instant = Instant.now(); //gives UTC time
        System.out.println(instant);

        //Custom Format
        LocalDateTime datetime = LocalDateTime.now();
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String newDateTime = datetime.format(format);
        System.out.println(newDateTime);

        //--------------------------------------------//

        LocalDate dates = LocalDate.of(2024,12,25);
        System.out.println(dates);
        
        LocalDateTime time1 = LocalDateTime.of(2025,1,1,12,0,0);
        System.out.println(time1);

        LocalDateTime time2 = LocalDateTime.of(2026,2,1,12,0,0);
        System.out.println(time2);

        //--------Comparing Dates--------//

        if(time1.isBefore(time2)){
            System.out.println("Before");
        }

        else if(time1.isAfter(time2)){
            System.out.println("After");
        }

        else{
            System.out.println("Equal");
        }

        //-------------------------------//

    }
}