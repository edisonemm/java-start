public class NestedStatement {
    static void statement() {

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if (isStudent){
            if(isSenior){
                IO.println("You get a senior discount of 20%");
                IO.println("YOu get a student discount of 20%");
                price *= 0.7;
            }
            else{
                IO.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else {
            if(isSenior){
                IO.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            else {
                price *= 1;
            }
        }

        System.out.printf("The price of  ticket is : $%f", price);

    }
}
