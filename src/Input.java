import java.util.Scanner;

public class Input {
    public static void scanner(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Write your age: ");
        int age = scanner.nextInt();

        System.out.print("Wht is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);


        scanner.nextLine();
        // COMMON ISSUES nextLine space in lines

        System.out.print("Enter your age: ");
        int years = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("you are " + years + " years old");
        System.out.println("You like the color " + color);


        scanner.nextLine();
        // Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the width: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The are is: " + area + "cm²");

        scanner.close();
    }
}
