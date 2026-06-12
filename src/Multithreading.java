import opp.multithreading.MyRunnable;

public class Multithreading {

    // Multithreading = Enables a program to run multiple threads concurrently
    //                  (Thread = A set of instructions that run independently
    //                  Useful for background task of time-consuming operations

    static void demo(){

        Thread thread1 = new Thread(new MyRunnable("WIWI"));
        Thread thread2 = new Thread(new MyRunnable("WAWA"));
        thread1.start();
        thread2.start();

        IO.println("Game Start!!");
        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e) {
            IO.println("Main thread was interrupted");
        }
        IO.println("Game Over!!!");
    }
}
