import java.util.Scanner;

public class Shopping {
    static void cartprogram(){
        // SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        IO.println("What item would you like to buy?: ");
        item = scanner.nextLine();

        IO.println("What is the price for each?: ");
        price = scanner.nextDouble();

        IO.println("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        IO.println("\nyou have bought " + quantity + " " + item + "/s");
        IO.println("Your total is " + currency + total);

//        IO.println(item);

    }
}
