import opp.Car;

import java.util.Random;
import java.util.Scanner;

public class ObjetcOrientedProgramming {
    static void opp(){

        // Object = An entity that holds data (attributes)
        //          and can perform actions (methods)
        //          It is a reference data type

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Car car = new Car();
        IO.println(car.getModel());

        car.start();
        car.drive();
        car.stop();

        Car car1 = new Car();
        Car car2 = new Car();

        IO.println(car1.getMake() + " " + car1.getModel());
        IO.println(car2.getMake() + " " + car2.getModel());

        scanner.close();
    }
}
