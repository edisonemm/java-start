import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    static void program() {

        // JAVA SLOT MACHINE

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // DISPLAY WELCOME MESSAGE
        IO.println("Welcome to Java Slots");
        IO.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");

        // PLAY IF BALANCE > 0
        while (balance > 0) {
            IO.println("Current balance: $" + balance);
            // ENTER BET AMOUNT
            IO.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            //      VERIFY IF BET > BALANCE
            if (bet > balance) {
                IO.println("INSUFFICIENT FUNDS");
                continue;
            }
            //      VERIFY IF BET > 0
            else if (bet <= 0) {
                IO.println("Bet must be grater than 0");
                continue;
            }
            //      SUBTRACT BET FROM BALANCE
            else {
                balance -= bet;
//                IO.println("$" + balance);
            }
            // SPIN ROW
//            IO.println("Spinning...");
            row = spinRow();
        // PRINT ROW
            printRow(row);
        // GET PAYOUT
            payout = getPayout(row, bet);

            if (payout > 0){
                IO.println("You won $" + payout);
                balance += payout;
            }
            else {
                IO.println("Sorry you lost this round");
            }
            // ASK TO PLAY AGAIN
            IO.println("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }
        }

        // DISPLAY EXIT MESSAGE
        IO.println("GAME OVER! Your final balance is $" + balance);


        scanner.close();
    }

    static String[] spinRow() {

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row) {
        IO.println("***************");
        IO.println(" " + String.join(" | ", row));
        IO.println("***************");
    }
    static int getPayout(String[] row, int bet){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        return 0;
    }
}
