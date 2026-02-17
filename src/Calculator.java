import java.util.Scanner;

public class Calculator {
    static void calculator(){
        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        IO.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        IO.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        IO.print("Enter the # of time compounded per year: ");
        timesCompounded = scanner.nextInt();

        IO.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        System.out.printf("The amount after %d years is $%.2f", years, amount);

        scanner.close();
    }
}
