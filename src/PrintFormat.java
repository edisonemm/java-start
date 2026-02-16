public class PrintFormat {
    static void format() {

        // prinf() = is a method  used to format output
        // %[flags][.precision][specifier-character]

        String name = "SpongeBob";
        char firsLetter = 'S';
        int age = 40;
        double height = 1.80;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firsLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;
        System.out.printf("%.2f\n", price1);
        System.out.printf("%.1f\n", price2);
        System.out.printf("%.3f\n", price3);

    }
}
