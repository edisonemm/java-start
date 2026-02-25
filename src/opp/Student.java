package opp;

public class Student {
    // 1. Attributes privates (Encapsulation)
    private String name;
    private int age;
    private double gpa;
    private final boolean isEnrolled;

    // 2. Constructor con validations
    public Student(String name, int age, double gpa) {
        this.setName(name); // We use the setter to validate from the beginning
        this.setAge(age);
        this.setGpa(gpa);
        this.isEnrolled = true;
    }

    // --- DEFAULT CONSTRUCTOR (No arguments) ---
    // If nothing is passed, we assign "factory" values
    public Student() {
        this("NN", 18, 0.0); // Calls the constructor above
    }

    // --- PARTIAL CONSTRUCTOR (Name only) ---
    public Student(String name) {
        this(name, 18, 0.0); // Assumes 18 years old and 0.0 GPA
    }

    // --- PARTIAL CONSTRUCTOR (Name, age only) ---
    public Student(String name, int age) {
        this(name, age, 0.0); // Assumes 18 years old and 0.0 GPA
    }

    // 3. Getters y Setters (The "toll" to enter or leave the classroom)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            this.name = "Unknown";
        } else {
            this.name = name.toUpperCase();
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // We prevent anyone from being 2100 years old or less than 0
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.err.println("Error: Age " + age + " not valid. will be assigned 0.");
            this.age = 0;
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        // We validate that the GPA is between 0.0 and 4.0 (or 5.0 depending on your country)
        if (gpa >= 0.0 && gpa <= 5.0) {
            this.gpa = gpa;
        } else {
            this.gpa = 0.0;
        }
    }

    // 4. toString Method: Allows you to print the object directly
    @Override
    public String toString() {
        return String.format("Student[Name: %s, Age: %d, GPA: %.2f, Enrolled: %b]", name, age, gpa, isEnrolled);
    }

    public void study() {
        System.out.println(this.name + " is studying hard!");
    }
}
