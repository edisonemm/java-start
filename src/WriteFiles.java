import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
    // How to write a file using java (4 popular options)

    // FileWriter = Good for small or medium-sized text files
    // BufferedWriter = Better performance for large amount of text
    // PrintWriter = Best for structure data, like reports or logs
    // FileOutputStream = Best for binary files (e.g., images, audio files)

    static void demo(){

        String filePath = "c:.....";
//        String textContent = "I like Mango\nIs really good\nBuy me a mango";
        String textContent = """
                I like Mango
                Is really good
                Buy me a mango
                """;

        try(FileWriter writer = new FileWriter("text.txt")){
            writer.write(textContent);
            IO.println("Txt file has been written");
        }
        catch (FileNotFoundException e){
            IO.println("Could not locate file location");
        }
        catch (IOException e){
            IO.println("Could not write file");
        }
    }
}
