import opp.inheritance.Animal;
import opp.inheritance.Cat;
import opp.inheritance.Dog;
import opp.inheritance.Plant;

public class Inheritance {

    // Inheritance = Once class inherits the attributes and methods
    //               from another class
    //               child <-- parent

    static void demo() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        IO.println(dog.lives);
        IO.println(cat.lives);
        dog.speak();
        cat.speak();
        IO.println(cat.isAlive);
        IO.println(plant.isAlive);
        plant.photosynthesize();

    }
}
