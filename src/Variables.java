public class Variables {

    public static void saludar() {

//      VARIABLES
//      Primitive int double char boolean
//      References String Array Object
//
//      Ways Variables
//      1. Declaration
//      2. Assignment

//      int age;
        int age = 20;
        System.out.println(age);

        int year = 2026;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';


        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        if(isStudent){
            IO.println("You are a student!");
        }
        else {
            IO.println("You are not a student");
        }

        String name = "Edison Active";
        String food = "mango";
        String email = "activo@email.com";
        String car = "Lamborghini";
        String color = "blue";

        IO.println("Your choice is a " + " " + year + " " + car);
        IO.println("The price is : " + currency + price );

        if(forSale) {
            IO.println("There is a " + car + " for sale");
        }
        else{
            IO.println("The " + car + " is not for sale");
        }


    }



}
