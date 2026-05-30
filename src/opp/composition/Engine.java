package opp.composition;

public class Engine {

    private String type;

    public Engine(String type) {
            setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
