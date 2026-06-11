import opp.generics.Box;
import opp.generics.Product;

import java.util.ArrayList;

public class Generics {

    //  Generics = A concept where you can write a class, interface, or method
    //             that is compatible with multiples data types.
    //             <T> Type parameter (placeholder that gets replaced with a real type)
    //             <String> type argument (specifies the type)

    static void demo(){
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("mango");
        fruits.add("apple");
        fruits.add("blueberry");

        Box<String> box = new Box<>();
//        Box<String> `box = new Box<>();
        box.setItem("banano");
        IO.println(box.getItem());

        Product<String, Double> product1 = new Product<>("Mango", 2000.0);
        Product<String, Integer> product2 = new Product<>("Ticket", 2);
        IO.println(product2.getItem());
        IO.println(product2.getPrice());
    }
}
