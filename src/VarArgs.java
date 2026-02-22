public class VarArgs {
    static void varargs(){
        // varargs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ELLIPSIS)

        IO.println(add(1,2));
        IO.println(average(1));
    }
    static int add(int... numbers){

        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    static double average(double...  numbers){
        double sum = 0;

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }

}
