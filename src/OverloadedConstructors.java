import opp.User;

public class OverloadedConstructors {
    static void demo() {

        // overloaded constructors = Allows a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialized in various ways.


        User user1 = new User();
        User user2 = new User("Active", "active@gmail.com");
        IO.println(user1.toString());
    }
}
