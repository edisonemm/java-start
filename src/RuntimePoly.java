import opp.runtimepolymorphism.Dog;
import opp.runtimepolymorphism.Cat;
import opp.runtimepolymorphism.Animal;
import java.util.Scanner;

public class RuntimePoly {

    // Runtime polymorphism = When the method that gets executed is decided
    //                        at runtime based on the actual type of the object.

    static void demo(){
        Scanner scanner = new Scanner(System.in);

        Animal animal;
//        IO.println(animal.toString());

        IO.println("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2){
            animal = new Cat();
            animal.speak();
        }
    }
}
