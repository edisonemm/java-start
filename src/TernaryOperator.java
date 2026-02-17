public class TernaryOperator {
    static void ternary(){

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int score = 70;
//        if (score >= 50) {
//            IO.println("PASS");
//        }
//        else{
//            IO.println("FAIL");
//        }
        String passOrFail = (score >= 80) ? "PASS" : "FAIL";
        IO.println(passOrFail);

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        IO.println(evenOrOdd);

        int hours = 13;
        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        IO.println(timeOfDay);

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.25 : 0.14;
        IO.println(taxRate);
    }
}
