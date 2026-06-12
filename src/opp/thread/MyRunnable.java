package opp.thread;

public class MyRunnable implements Runnable {

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                IO.println("Thread was interrupted");
            }

            if(i == 5){
                IO.println("Time's up!");
                System.exit(0);
            }
        }
    }

}
