import java.util.Scanner;

public class WeightConvert {
    static void program(){
        // WEIGHT CONVERSION PROGRAM

        // Declare variables
        Scanner scanner =  new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        // welcome message
        IO.println("Weight conversion Program");
        IO.println("1: Convert lbs to kgs");
        IO.println("2: Convert kgs to lbs");


        // prompt for user choice
        IO.print("choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
        // option 1 convert lbs to kgs
             IO.println("Enter the weight in lbs: ");
             weight = scanner.nextDouble();
             newWeight = weight * 0.454592;
             System.out.printf("The new weight in kgs is: %.2fKG", newWeight);
        }
        else if(choice == 2) {
        // option 2 convert kgs to lbs
            IO.println("Enter the wight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2fLB", newWeight);
        }
        else {
            IO.print(choice + " Not a valid choice");
        }

        scanner.close();
    }
}
