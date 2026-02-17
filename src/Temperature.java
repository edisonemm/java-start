import java.util.Scanner;

public class Temperature {
    static void converter(){
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        IO.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        IO.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5/ 9) + 32;
        System.out.printf("%.1f°%s", newTemp, unit);
//        IO.println(newTemp);

        scanner.close();
    }
}
