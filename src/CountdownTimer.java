import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {

    // Java COUNTDOWN TIMER PROGRAM

    static void demo(){

        Scanner scanner = new Scanner(System.in);

        IO.println("Enter # of seconds to countdown from: ");
        int response = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {
                IO.println(count);
                count--;
                if(count < 0){
                    IO.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
