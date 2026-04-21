import opp.Car;

public class toStringClass {
    // .toString() = Method inherited from the Object class.
    //                Used to return a string representation of an object.
    //                By default, it returns a hash code as  unique identifier.
    //                It can be overridden to provide meaningful details.

    static void demo(){

        Car car = new Car("audi", "r8", 2026, 100000);

        IO.println(car);
    }
}
