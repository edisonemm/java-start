package opp;

public class Car {

    public String make = "Ford";
    public String model = "Mustang";
    public int year = 2025;
    public double price = 58000.99;
    public boolean isRunning = false;

    public void start (){
        isRunning = true;
        IO.println("You start the engine");
    }
    public void stop(){
        isRunning = false;
        IO.println("You stop the engine");
    }
    public void drive(){
        IO.println("You drive the " + model);
    }
    public void brake(){
        IO.println("You brake the " + model);
    }

}
