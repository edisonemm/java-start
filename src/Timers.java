import java.util.Timer;
import java.util.TimerTask;

public class Timers {
    // Timer = class that schedule tasks at specific times or periodically
    //         Useful for: sending notifications, schedule options, repetitive actions

    // TimerTask = Represent the task will be executed by the Timer
    //             You wil extend the TimerTask class to define your task
    //             Create a subclass of TimerTask and @Override run()

    static void demo(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;
            @Override
            public void run() {
                IO.println("Hello!");
                count--;
                if(count < 0 ){
                    IO.println("TASK COMPLETE");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 3000, 1000);
    }
}
