import opp.interfaces.Hawk;
import opp.interfaces.Rabbit;

public class Interfaces {
    static void demo(){
        // Interface = A blueprint for a class that specifies a set of abstract methods
        //             that simple emitting classes MUST define.
        //             Supports multiple inheritance-like behavior.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        rabbit.flee();
        hawk.hunt();

    }
}
