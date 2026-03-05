package opp;

public class Friend {

    private static int numOfFriends;
    private String name;

    public Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumOfFriends() {
        return numOfFriends;
    }

    public static void setNumOfFriends(int numOfFriends) {
        Friend.numOfFriends = numOfFriends;
    }

    public static void showFriends(){
        IO.println("You have " + Friend.getNumOfFriends());
    }
}
