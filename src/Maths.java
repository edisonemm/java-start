import java.util.Scanner;

public class Maths {
    static void math(){
        double result;

        result = Math.pow(2,5);
        IO.println(result);
        result = Math.abs(-5);
        IO.println(result);
        result = Math.sqrt(9);
        IO.println(result);
        result = Math.round(3.14);
        IO.println(result);
        result = Math.ceil(3.14);
        IO.println(result);
        result = Math.floor(3.99);
        IO.println(result);
        result = Math.max(10,20);
        IO.println(result);
        result = Math.min(10,20);
        IO.println(result);

        // HYPOTENUSE C = Math.sqrt(a² + b²)
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        IO.println("Enter the length of side A: ");
        a = scanner.nextDouble();
        IO.println("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        IO.println("The Hypotenuse (side c) is: " + c);

        // Circumference = 2 * Math.PI * radios;
        // Area = Math.PI * Math.pow(radius, 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        double radius;
        double circumference;
        double area;
        double volume;

        IO.println("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume =  (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

//        IO.println("The circumference is: " + circumference + "cm");
//        IO.println("The area is: " + area + "cm²");
//        IO.println("The volume is: " + volume + "cm³");
        System.out.printf("The circumference is: %.2fcm\n", circumference);
        System.out.printf("The area is: %.2fcm²\n", area);
        System.out.printf("The volume is: %.2fcm³", volume);

        scanner.close();
    }
}

