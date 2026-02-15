public class Variables {

    public static void saludar() {

//      Variable
//      Primitiva
//      Rerencia
//
//      Primitiva int double char boolean
//      Referencia String Array Object
//
//      Crear Variables
//      1. Declaracion
//      2. Assignamiento

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
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are not a student");
        }

        String name = "Edison Active";
        String food = "mango";
        String email = "activo@email.com";
        String car = "Lamborghini";
        String color = "blue";

        System.out.println("Your choice is a " + " " + year + " " + car);
        System.out.println("The price is : " + currency + price );

        if(forSale) {
            System.out.println("There is a " + car + " for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }


    }



}
