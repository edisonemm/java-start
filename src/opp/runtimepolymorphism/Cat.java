package opp.runtimepolymorphism;

public class Cat extends Animal{

    @Override
    public void speak(){
        IO.println("The cat goes *meow*");
    }
}
