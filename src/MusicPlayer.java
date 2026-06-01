import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    static void demo(){
        // How to PLAY AUDIO with java (.wav, .au, .aiff)

        String filePath = "C:\\Users\\ediso\\Downloads\\Martin Garrix - Animals (Official Video) - STMPD RCRDS (128k).wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while(!response.equals("Q")) {
                IO.println("P = Play");
                IO.println("S = Stop");
                IO.println("R = Reset");
                IO.println("Q = Quit");
                IO.println("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> IO.println("Invalid choice ");
                }
            }

        }
        catch (FileNotFoundException e) {
            IO.println("could not locate file");
        }
        catch (UnsupportedAudioFileException e) {
            IO.println("Audio file is not supported");
        }
        catch (LineUnavailableException e) {
            IO.println("unable to access audio resource");
        }
        catch (IOException e){
            IO.println("something went wrong");
        }
        finally {
            IO.println("Bye!");
        }

    }
}
