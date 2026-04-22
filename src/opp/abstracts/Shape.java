package opp.abstracts;

public abstract class Shape {
    abstract double area(); //ABSTRACT

    public void display() { // CONCRETE
        IO.println("This is a shape");
    }
}
