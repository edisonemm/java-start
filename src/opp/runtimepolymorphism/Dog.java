package opp.runtimepolymorphism;

public class Dog extends Animal{

    @Override
    public void speak(){
        IO.println("The dog goes *woof*");
    }
}
