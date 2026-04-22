import opp.abstracts.Circle;
import opp.abstracts.Rectangle;
import opp.abstracts.Triangle;

public class Abstract {

    // abstract = Used to define abstract classes and methods.
    //            Abstraction is the process of hiding implementation details
    //            and showing only the essential features;
    //            Abstract classes CAN'T be instantiated directly
    //            Can contain 'abstract' methods (which must be implemented)
    //            Can contain 'concrete' methods (which are inherited)

    static void demo(){
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10,5);
        Rectangle rectangle = new Rectangle(6,12);

        circle.display();
        rectangle.display();
        triangle.display();

        IO.println(circle.area());
        IO.println(triangle.area());
        IO.println(rectangle.area());
    }


}
