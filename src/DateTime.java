import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    static void demo(){

        // How to work with DATES AND TIMES using java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        // Custom format
//        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
//        IO.println(newDateTime);
        LocalDateTime date = LocalDateTime.of(2026, 6, 2, 12, 0, 0);
        LocalDateTime date1 = LocalDateTime.of(2026, 6, 2, 12, 0, 0);

        if(date.isBefore(date1)){
            IO.println(date + " is earlier than " + date1);
        }
        else if(date.isAfter(date1)){
            IO.println(date + " is later than " + date1);
        }
        else if(date.isEqual(date1)){
            IO.println(date + " is equal to " + date1);
        }

//        IO.println(date);

        IO.println(dateTime);
        IO.println(time);
        IO.println(instant);
    }
}
