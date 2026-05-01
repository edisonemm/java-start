package opp.getsetter;

public class Car {
    private String model;
    private String color;
    private int price;

    public Car(String model, String color, int price){
        setModel(model);
        setColor(color);
        setPrice(price);
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

    public String getPrice() {
        return String.format("$%,d", price);
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
