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
        IO.println(car.price);

        car.start();
        car.drive();
        car.brake();

        Car car1 = new Car();
        Car car2 = new Car();

        IO.println(car1.make + " " + car1.model);
        IO.println(car2.make + " " + car2.model);

        scanner.close();
    }
}
