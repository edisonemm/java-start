import java.util.Scanner;

public class SwitchStatement {
    static void multiconditional() {

        // Enhanced switch = A replacement to many else if statements (java 14 feature)

        Scanner scanner = new Scanner(System.in);

        String day;
//        String day = "Monday";
        IO.print("Enter the day of the week: ");
        day = scanner.nextLine();

        switch(day){
//            case "Monday" ->  IO.println("It is a weekday");
//            case "Tuesday" ->  IO.println("It is a weekday");
//            case "Wednesday" ->  IO.println("It is a weekday");
//            case "Thursday" ->  IO.println("It is a weekday");
//            case "Friday" ->  IO.println("It is a weekday");
//            case "Saturday" ->  IO.println("It is a weekend");
//            case "Sunday" ->  IO.println("It is a weekend");
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> IO.println("It is a weekday");
            case "Saturday", "Sunday" -> IO.println("It is a weekend");
            default -> IO.println(day + " is not a day");
        }

        scanner.close();
    }
}
