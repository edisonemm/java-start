package opp;

public class User {

    private String username;
    private String email;
    private int age;

    public User(String username, String email, int age) {
        this.setUsername(username);
        this.setEmail(email);
        this.setAge(age);
    }

    public User(){ this("Guest", "Not provided", 0); }

    public User(String username) { this(username, "Not Provided", 0); }

    public User(String username, String email) { this(username, email, 0); }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) { this.email = email; }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return this.username + " " + this.email;
    }
}
