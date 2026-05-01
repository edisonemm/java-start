import opp.getsetter.Car;

public class GetSetter {
    // They help protect object data and add rules for accessing or modifying them.
    // GETTERS = Methods that make a field READABLE.
    // SETTERS = Methods that make a field WRITEABLE.

    static void demo(){
        Car car = new Car("Charger", "Yellow", 21000);

        IO.println(car.getColor());
        IO.println(car.getModel());
        IO.println(car.getPrice());
    }
}
