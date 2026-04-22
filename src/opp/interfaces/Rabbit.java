package opp.interfaces;

public class Rabbit implements Prey{
    @Override
    public void flee(){
        IO.println("*The rabbit is running away*");
    }
}
