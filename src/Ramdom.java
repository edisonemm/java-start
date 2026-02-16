import java.util.Random;

public class Ramdom {
    static void ramdom() {
        Random random = new Random();
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        IO.println(number1);
        IO.println(number2);
        IO.println(number3);

        double number;
        boolean isHeads;

        number = random.nextDouble();
        IO.println(number);

        isHeads = random.nextBoolean();
        if(isHeads) {
            IO.println("HEADS");
        }
        else{
            IO.println("TAILS");
        }
    }
}
