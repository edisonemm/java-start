import java.util.Scanner;

public class Calculator {
    static void procces() {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        IO.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        IO.print("Enter an operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        IO.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0) {
                    IO.println("Cannot divide by zero!");
                    validOperation = false;
                }
                else{
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                IO.println("Operator not valid!!!!");
                validOperation = false;
            }
        }
        if(validOperation) {
            IO.println(result);
        }

        scanner.close();
    }
}
