package opp;

public class Car {

    private String make;
    private String model;
    private int year;
    private double price;
    private boolean isRunning;


    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = (price > 0) ? price : 0.0;
    };
    public Car() { this("make", "model", 0,0.0); };


    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("The " + model + " engine is now running.");
        } else {
            System.out.println("The engine is already started.");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("The engine has been turned off.");
        } else {
            System.out.println("The engine is already off.");
        }
    }

    public void drive() {
        if (isRunning) {
            System.out.println("Driving the " + make + " " + model + "...");
        } else {
            System.out.println("Cannot drive; the engine is off!");
        }
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return String.format("Car[Make=%s, Model=%s, Year=%d, Price=%.2f]",
                make, model, year, price);
    }
}