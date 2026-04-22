package opp.interfaces;

public class Hawk implements Predator {
    @Override
    public void hunt(){
        IO.println("*The hawk is hunting*");
    }
}
