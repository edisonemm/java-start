import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {
    // ArrayList = A resizeable array that stores objects (autoboxing).
    //             Array are fixed in size, but ArrayList  can change.

    static void demo(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("blueberry");
        fruits.add("banana");
//        fruits.remove(0);
//        fruits.set(1, "pineaple");

        IO.println(fruits.size());
        IO.println(fruits);
        IO.println(fruits.get(3));

        Collections.sort(fruits);
        IO.println(fruits);
        IO.println(fruits.get(3));

        for(String fruit : fruits){
            IO.println(fruit);
        }

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        IO.println("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++){
            IO.print("Enter food #" + i + ":");
            String food = scanner.nextLine();
            foods.add(food);
        }
        IO.println(foods);

        scanner.close();
    }
}
