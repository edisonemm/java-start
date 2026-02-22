public class Array2D {
    static void array(){
        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};
//        IO.println("Groceries: " + groceries);
        groceries[2][1] = "eggs";

        for(String[] foods : groceries) {
//            IO.println(foods[0]);
            for(String food: foods){
                IO.print(food + " ");
            }
            IO.println();
        }

        char[][] telephone = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char number : row) {
                IO.print(number + "  ");
            }
            IO.println();
        }
    }
}
