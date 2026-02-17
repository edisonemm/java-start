public class Methods {
    static void method(){

        // method =  block of reusable code tht is executed when called ()

        String name = "Active";
        int age = 20;
        if(agecheck(age)){
            IO.println("You may sign up!");
        }
        else {
            IO.println("You must be 18+ to sign up");
        }

        happyBirthday(name, age);

        IO.print(square(20));
        IO.print(cube(20));
        IO.println(getFullName("Active", "Gold"));

        IO.println(add(2, 2, 2));

        String mango = bakeMango("mmm");

    }
    // method
    static void happyBirthday(String name, int age){
        IO.println("Happy Birthday to you!");
        System.out.printf("Happy birthday dear %s!", name);
        System.out.printf("You are %d years old!", age);
        IO.println("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean agecheck(int age){
        return age >= 18;
    }

    // Overloaded methods = methods that share the same name,
    // but different parameters signature = name + parameters
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static String bakeMango(String bread){
        return bread + " mango";
    }
    static String bakeMango(String bread, String cheese){
        return cheese + " " + bread + " mango";
    }
    static String bakeMango(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " mango";
    }
}
