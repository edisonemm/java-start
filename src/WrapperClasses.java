public class WrapperClasses {

    // Wrapper classes = Allow primitive values (int, char, double, boolean)
    //                   to be used as objects. "Wrap them in an object"
    //                   Generally, don't wrap primitives unless you need an object.
    //                   Allows use of Collections Framework and static Utility Methods.

    static void demo(){
        int number = 123;

        Integer a = new Integer(123);
        Double b  = new Double(3.14);
        Character c = new Character('$');
        Boolean d = new Boolean(true);

        // Autoboxing
        String e = "Mango";
        Integer f = 123;
        Double g = 2.133;
        Character h = '#';
        Boolean i = true;

        // Unboxing
        boolean l = i;

        String x = Integer.toString(123);
        String y = Double.toString(1.2);
        String z = Character.toString('@');
        String m = Boolean.toString(false);

        String n = x + y + z + m;
        IO.println(n);
    }
}
