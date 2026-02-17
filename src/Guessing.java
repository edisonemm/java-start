import java.util.Random;
import java.util.Scanner;

public class Guessing {
    static void game(){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max);

        IO.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            IO.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber) {
                IO.println("TOO LOW! Try again");
            }
            else if(guess > randomNumber){
                IO.println("Too HIGH! Try again");
            }
            else {
                IO.println("CORRECT! The number was " + randomNumber);
                IO.println("# of attempts: " + attempts);
            }

        }while(guess != randomNumber);

        IO.println("You have won");
    }
}
