import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFiles {

    // How to read file using java (3 popular options)

    // BufferedReader + FileReader: Best for reading text files line-by-line
    // FileInputStream: Best for binary files (e.g., images, audio files)
    // RandomAccessFile: Best for read/write specific portions of a large file

    static void demo() {
        String filePath = "text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            IO.println("that file exits\n");

            String line;
            while((line = reader.readLine()) != null) {
                IO.println(line);
            }
        }
        catch(FileNotFoundException e) {
            IO.println("Could not locate files");
        }
        catch(IOException e){
            IO.println("something went wrong");
        }
    }
}
