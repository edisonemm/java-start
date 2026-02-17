import java.util.Scanner;

public class ForLoop {
    static void loop() throws InterruptedException {

        // for loop = execute some code a CERTAIN amount of times

        Scanner scanner = new Scanner(System.in);

//        for(int i = 0; i < 10; i++){
//            IO.println(i);
//        }
        IO.print("Enter how many time you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 0; i < max; i++) {
            IO.println(i);
        }

        int start = 10;
        for(int i = start; i > 0; i--){
            IO.println(i);
            Thread.sleep(1000);
        }
        IO.println("HAPPY NEW YEAR!");

        // NESTED LOOP = a loop inside another loop. Used ofter with matrices or DS&A

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j<= 9; j++){
                IO.print(j + " ");
            }
            IO.println();
        }

        int rows;
        int columns;
        char symbol;

        IO.print("Enter the # rows: ");
        rows = scanner.nextInt();
        IO.print("Enter the # columns: ");
        columns = scanner.nextInt();
        IO.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                IO.print(symbol + " ");
            }
            IO.println();
        }

        scanner.close();
    }
}
