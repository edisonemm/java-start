package opp;

public class Person {
    private String first;
    private String last;

    public Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    public void showName(){
        IO.println(this.first + " " + this.last);
    }
}
