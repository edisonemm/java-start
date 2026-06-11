import opp.enums.Day;
import java.util.Scanner;

public class Enums {

    // Enums = (Enumerations) A special kind of class that
    //         represents a fixed set of constants.
    //         They improve code readability and are easy to maintain.
    //         More efficient with switches when comparing Strings.

    static void demo(){

        Scanner scanner = new Scanner(System.in);
        IO.println("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {

            Day day = Day.valueOf(response);

            IO.println(day);
            IO.println(day.getDayNumber());

            switch (day){
                case MONDAY,
                     TUESDAY,
                     WEDNESDAY,
                     THURSDAY,
                     FRIDAY -> IO.println("It is a weekday");
                case SATURDAY, SUNDAY -> IO.println("It is a weekend");

            }
        }
        catch (IllegalArgumentException e){
            IO.println("Please enter a valid day");
        }

        scanner.close();
    }
}
