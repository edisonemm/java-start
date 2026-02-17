import java.util.Scanner;

class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    static void program() {
        // JAVA BANKING PROGRAM FOR BEGINNERS

        // DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            // DISPLAY MENU
            IO.println("***************");
            IO.println("BANKING PROGRAM");
            IO.println("***************");
            IO.println("1. Show Balance");
            IO.println("2. Deposit");
            IO.println("3. Withdraw");
            IO.println("4. Exit");
            IO.println("***************");

            // GET AND PROCESS USERS CHOICE
            IO.print("Enter your choice (1-4)");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> IO.println("INVALID CHOICE");
            }
        }


    }

    // ShowBalance()
    static void showBalance(double balance) {
        IO.println();
        IO.println("Your Balance is: $" + balance);
        IO.println();
    }

    //deposit()
    static double deposit() {
        double amount;

        IO.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            IO.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }

    // withdraw()
    static double withdraw(double balance) {

        double amount;

        IO.println("Enter amount to be withdrawn");
        amount = scanner.nextDouble();

        if(amount > balance){
            IO.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            IO.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }

    }

    // EXIT MESSAGE

}
