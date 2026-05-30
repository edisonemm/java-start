import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    // Exception = An event that interrupts the normal flow of the program
    //             (Diving by zero, file not found, mismatch input type)
    //             Surround any dangerous code with a try{} block
    //             try{}, catch{}, finally{}

    static void demo(){

        Scanner scanner = new Scanner(System.in);

        try {
            IO.print("Enter a number: ");
            int number = scanner.nextInt();
            IO.println(number);
        } catch (InputMismatchException e){
            IO.println("El dato debe ser un numero!");
        } catch (Exception e) {
            IO.println("!ERROR!!!");
        } finally {
            scanner.close();
            IO.println("Executinggggg");
        }

        try {
            IO.println(1 / 0);
        } catch (ArithmeticException e) {
            IO.println("YOU CAN'T DIVIDE BY ZERO!");

        }

    }
}
