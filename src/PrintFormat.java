public class PrintFormat {
    static void format() {

        // prinf() = is a method  used to format output
        // %[flags][width][.precision][specifier-character]

        String name = "SpongeBob";
        char firsLetter = 'S';
        int age = 40;
        double height = 1.80;
        boolean isEmployed = true;

        // SPECIFIER CHARACTER
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firsLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        // PRECISION
        System.out.printf("%.2f\n", price1);
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.3f\n", price3);

        //FLAGS\
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive
        System.out.printf("%+.2f\n", price1);
        System.out.printf("%,.1f\n", price2);
        System.out.printf("%(.3f\n", price3);

        // WIDTH
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);
    }
}
