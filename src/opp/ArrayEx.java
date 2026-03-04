package opp;

public class ArrayEx {
    // class Car

    private String model;
    private String color;

    public ArrayEx(String model, String color) {
        this.setModel(model);
        this.setColor(color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drive(){
        IO.println("You drive the " + this.model + " color " + this.color);
    }

    @Override
    public String toString(){
        return this.model + " " + this.color;
    }
}
