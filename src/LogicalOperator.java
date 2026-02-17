import java.util.Scanner;

public class LogicalOperator {
    static void operators(){

        // && = AND
        // || = OR
        // ! = NOT

        Scanner scanner = new Scanner(System.in);

        double temp = 20;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            IO.println("Thew weather is GOOD 😃");
            IO.println("It is SUNNY outside ☀️");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            IO.println("The weather is GOOD 🫡");
            IO.println("It is CLOUDY outside ☁️");
        }
        else if(temp > 30 || temp < 0){
            IO.println("The weather is bad 😑");
        }

        String username;
        IO.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            IO.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")) {
            IO.println("Username must not contain spaces or underscores");
        }
        else{
            IO.println("Welcome " + username);
        }

        scanner.close();
    }
}
