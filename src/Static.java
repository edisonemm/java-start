import opp.Friend;

public class Static {

    // static = Makes a variable or method belong to the class
    //          rather than to any specific object.
    //          Commonly used for utility methods or shred resources.

    static void demo(){
        Friend friend1 = new Friend("Edison");
        Friend friend2 = new Friend("Edison");
        Friend friend3 = new Friend("Edison");
        Friend friend4 = new Friend("Edison");
        Friend friend5 = new Friend("Edison");
        Friend.showFriends();
    }
}
