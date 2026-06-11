import java.util.HashMap;
import java.util.Locale;

public class HashMaps {

    // HashMap = A data structure that stores key-value pairs
    //           keys are unique, but values can be duplicated
    //           Does not maintain any order, but is memory efficient
    //           HashMap<key, Value>

    static void demo(){

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("mango", 0.55);
        map.put("coco", 0.0);
//        map.put("apple", 0.0);

//        map.remove("apple");

        IO.println(map);
        IO.println(map.get("coco"));
        IO.println(map.containsKey("banana"));

        if(map.containsKey("apple")){
            IO.println(map.get("apple"));
        }
        else{
            IO.println("Key not found!");
        }

        IO.println(map.containsValue(0.0000));
        IO.println(map.size());

        IO.println();
        for (String key : map.keySet()){
            IO.println(key + " : $" + map.get(key));
        }
    }
}
