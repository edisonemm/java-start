import java.util.Scanner;

public class MadLibsGame {
    public static void game() {

        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        IO.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        IO.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        IO.print("Enter a verb and with -ing (action): ");
        verb1 = scanner.nextLine();
        IO.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        IO.println("Today I went to a " + adjective1 + " zoo.");
        IO.println("In an exhibit, I saw a " + noun1 + ".");
        IO.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        IO.println("I was " + adjective3 + "!");


        scanner.close();

    }


}
