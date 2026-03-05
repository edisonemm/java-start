import opp.Person;

public class Super {
    // super = Refers to the parent class (subclass <- superclass)
    //         Used in constructors and method overriding
    //         Calls the parent constructor to initialize attributes

    static void demo(){
        Person person = new Person("Edison", "active");

        person.showName();

    }
}
