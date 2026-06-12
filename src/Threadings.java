import opp.thread.MyRunnable;

import java.util.Scanner;

public class Threadings {

    // Threading = Allows a program to run multiple task simultaneously
    //             Helps improve performance with time-consuming operations
    //             (File I/O, network communications, or any background task)

    // How to create a Thread
    // Option 1. Extend the Thread class (simpler)
    // Option 2. Implement the runnable interface (better)

    static void demo(){
        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();

        IO.println("You have 5 seconds to enter your name");
        IO.print("Enter your name:");
        String name = scanner.nextLine();
        IO.println("Hello " + name);

        scanner.close();
    }
}
