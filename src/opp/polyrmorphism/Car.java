package opp.polyrmorphism;

public class Car implements VehicleX{

    @Override
    public void go(){
        IO.println("You drive the car");
    }
}
