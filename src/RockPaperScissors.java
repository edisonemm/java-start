import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static void game() {

        //  ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            // GET CHOICE FROM THE USER
            IO.print("enter yor move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                IO.println("Invalid choice");
            }

            // GET RANDOM CHOICE FOR THE COMPUTER
            computerChoice = choices[random.nextInt(3)];
            IO.println("Computer choice: " + computerChoice);

            // CHECK WIN CONDITIONS
            if (playerChoice.equals(computerChoice)) {
                IO.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                IO.println("You win!");
            } else {
                IO.println("You lose!");
            }

            // ASK TO PLAY AGAIN?
            IO.print("Play again (yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        // GOODBYE MESSAGE
        scanner.close();
    }
}
