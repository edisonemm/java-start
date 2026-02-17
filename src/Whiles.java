import java.util.Scanner;

public class Whiles {
    static void loop() {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()) {
            IO.print("Enter your name: ");
            name = scanner.nextLine();
        }
        IO.println("Hello " + name);

        String response = "";

        while(!response.equals("Q")){
            IO.println("You are playing a game");
            IO.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        int age = 0;
        IO.print("Enter you age: ");
        age = scanner.nextInt();

        do{
            IO.println("Your age can't be negative");
            IO.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

//        while(age < 0){
//            IO.println("Your age can't be negative");
//            IO.print("Enter your age: ");
//            age = scanner.nextInt();
//        }
        IO.println("You are " + age + " years old");

        int number = 0;
        while(number < 1 || number > 10){
            IO.print("Enter a number between 1 - 10");
            number = scanner.nextInt();
        }
        IO.println("You picked " + number);


        scanner.close();
    }
}
