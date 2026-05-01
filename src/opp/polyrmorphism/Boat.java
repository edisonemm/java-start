package opp.polyrmorphism;

public class Boat implements VehicleX{

    @Override
    public void go(){
        IO.println("You sail the boat");
    }
}
