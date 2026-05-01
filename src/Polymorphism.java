import opp.polyrmorphism.Bike;
import opp.polyrmorphism.Car;
import opp.polyrmorphism.Boat;
import opp.polyrmorphism.VehicleX;

public class Polymorphism {
    // Polymorphism = "POLY" = "MANY"
    //                "MORPH" = "SHAPE"
    //                Objects can identify as other objects.
    //                Objects can be treated as objects of a common superclass.

    static void demo(){
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        VehicleX[] vehicles = {car, bike, boat};
        IO.println(vehicles[1]);


        for (VehicleX vehicle: vehicles){
            vehicle.go();
        }
    }
}
