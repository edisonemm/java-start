import java.util.Scanner;
import java.util.Random;

public class RollerProgram {
    // ROLL ALL THE DICE
    // GET THE TOTAL
    // DISPLAY ASCII IF DICE
    static void program() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        IO.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();
        
        if(numOfDice > 0){
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                total += roll;
            }
            IO.println("Total: " + total);
        }
        else {
            IO.println("# of dice must be greater than 0");
        }
    }
    static void printDie(int roll){
        String dice1 = """
                -------
               |       |
               |   0   |
               |       |
                -------
               """;
        String dice2 = """
                -------
               | 0     |
               |       |
               |     0 |
                -------
               """;
        String dice3 = """
                -------
               | 0     |
               |   0   |
               |     0 |
                -------
               """;
        String dice4 = """
                -------
               | 0   0 |
               |       |
               | 0   0 |
                -------
               """;
        String dice5 = """
                -------
               | 0   0 |
               |   0   |
               | 0   0 |
                -------
               """;
        String dice6 = """
                -------
               | 0   0 |
               | 0   0 |
               | 0   0 |
                -------
               """;

        switch (roll){
            case 1 -> IO.print(dice1);
            case 2 -> IO.print(dice2);
            case 3 -> IO.print(dice3);
            case 4 -> IO.print(dice4);
            case 5 -> IO.print(dice5);
            case 6 -> IO.print(dice6);
            default -> IO.print("Invalid roll");
        }

    }
}
