import opp.ArrayEx;

public class ArrayObjects {
    static void demo(){

        var car1 = new ArrayEx("Honda", "blue");
        var car2 = new ArrayEx("Toyota", "green");
        var car3 = new ArrayEx("Lamborghini", "yellow");

        ArrayEx[] cars = {car1, car2, car3};

        for(ArrayEx car : cars){
            car.drive();
        }
        IO.println(car1.toString());
        IO.println(car2.toString());
        IO.println(car3.toString());
    }
}
