package opp.composition;

public class Car {
    private String model;
    private int year;
    private Engine engine;

    public Car(String model, int year, String engineType){
        setModel(model);
        setYear(year);
        setEngine(engineType);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(String engineType) {
        this.engine = new Engine(engineType);
    }
}
