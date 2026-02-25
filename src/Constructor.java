import opp.Student;

public class Constructor {
    static void demo(){

        // constructor = A special method to initialize objects
        //               You can pass arguments to a constructor \
        //               and set up initial values

        Student student1 = new Student("Edison", 20, 3.2);
        Student student2 = new Student("Active", 21, 2.33);
        Student student3 = new Student();
        Student student4 = new Student("mmm", 22);


        IO.println(student1);
        IO.println(student2);
        IO.println(student3);
        IO.println(student4);

        student3.study();
    }
}
