package opp;

public class Employee extends Person {
    private int salary;
    
    public Employee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void showSalary(){
        IO.println(getFirst() + "'s salary is $" + getSalary());
    }
}
