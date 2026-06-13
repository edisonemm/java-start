import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClockProgram {
    static void demo(){

        // JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "C:\\Users\\ediso\\Downloads\\Martin Garrix - Animals (Official Video) - STMPD RCRDS (128k).wav";

        while(alarmTime == null){
            try{
                IO.println("Enter an alarm time (HH:mm:ss): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                IO.println("Alarm set for " + alarmTime);
            } catch (DateTimeParseException e) {
                IO.println("Invalid format. Please use HH:mm:ss");
                break;
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

    }
}
