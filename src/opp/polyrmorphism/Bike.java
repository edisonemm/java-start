package opp.polyrmorphism;

public class Bike implements VehicleX{

    @Override
    public void go(){
        IO.println("You ride the bike");
    }
}
