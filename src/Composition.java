import opp.composition.Car;

public class Composition {
    // Composition = Represents a "part-of" relationship between objects.
    //               For example, an Engine is "part of" a Car.
    //               Allows complex objects to be constructed from smaller objects.

    static void demo(){
        Car car = new Car("Audi", 20023, "A1");

        IO.println(car.getModel());
        IO.println(car.getYear());
        IO.println(car.getEngine().getType());
    }
}
