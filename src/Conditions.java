import java.util.Scanner;

public class Conditions {
    static void conditional() {

        // If statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        IO.println("Enter your name: ");
        name = scanner.nextLine();

        IO.println("Enter your age: ");
        age = scanner.nextInt();

        IO.println("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();


        // 1

        if(name.isEmpty()){
            IO.println("YOu didn't enter your name!");
        }
        else {
            IO.println("Hello " + name + "!");
        }


        // 2
//        int age = 20;
        if(age < 65) {
            IO.println("You are a senior!");
        }
        else if(age >= 18) {
            IO.println("Your are an adult!");
        }
        else if(age < 0) {
            IO.println("You haven't been born yet!");
        }
        else if(age == 0) {
            IO.println("You are a baby");
        }
        else {
            IO.println("You are a child!");
        }

        // 3

        if(isStudent){
            IO.println("Your are a student!");
        }
        else {
            IO.println("You are NOT a student");
        }

        scanner.close();

    }

}
