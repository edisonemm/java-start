package opp.multithreading;

public class MyRunnable implements Runnable {

    private final String text;

    public MyRunnable(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(1000);
                IO.println(text);
//                IO.println(i);
            }
            catch (InterruptedException e){
                IO.println("Thread was interrupted");
            }

        }
    }
}
