package opp.interfaces;

public class Fish implements Prey, Predator {
    @Override
    public void flee(){
        IO.println("*The fish is swimming away*");
    }

    @Override
    public void hunt(){
        IO.println("*The fish is hunting*");
    }
}
