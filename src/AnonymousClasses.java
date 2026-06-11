import opp.annonymous.Dog;
import opp.annonymous.TalkingDog;

public class AnonymousClasses {
    static void demo(){
        // Anonymous class = A class that doesn't have a name. Cannot be reused.
        //                   Add custom behavior without having to create a new class.
        //                   Often used for one time use (TimerTask, Runnable, callbacks)

        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            public void speak(){
                IO.println("Scooby Doo says *Ruh Roh*");
            }
        };
        TalkingDog talkingDog = new TalkingDog();

        dog1.speak();
        dog2.speak();
        talkingDog.speak();

    }
}
