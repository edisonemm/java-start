import java.util.Arrays;
import java.util.Scanner;

public class ArraysMethods {
    static Scanner scanner = new Scanner(System.in);
    static void array() {

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        IO.println(fruits[1]);

        int numOfFruits = fruits.length;
        IO.println(numOfFruits);

        Arrays.sort(fruits);
//        Arrays.fill(fruits, "mango");

//        for (int i = 0; i < numOfFruits; i++) {
//            IO.println(fruits[i]);
//        }
        for (String fruit : fruits) {
            IO.println(fruit);
        }
        IO.println("");

        // Enter user input into array
        
        String[] foods;
        int size = 0;
//        IO.print("What # of food do you want?: ");
//        size = scanner.nextInt();
//        scanner.nextLine();

        foods = new String[size];
//        foods[0] = "pizza";
//        foods[1] = "taco";
//        foods[2] = "hamburger";
        for (int i = 0; i < foods.length; i++) {
            IO.println("Enter a food: ");
            foods[i] = scanner.nextLine();
        }
        for(String food : foods){
            IO.println(food);
        }

        // search an array
        int[] numbers = {1, 8, 2, 9, 3, 4, 5};
//        int target = 10;
        String target = "apple";
        boolean isFound = false;

        for (int i = 0; i < fruits.length; i++) {
            if(target == fruits[i]){
                IO.println("Element found at index: " + i);
                isFound = true;
                break;
            }

        }
        if(!isFound){
            IO.println("Element not found in the array");
        }

    scanner.close();
    }
}
