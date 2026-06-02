import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    static void demo(){

        // JAVA HANGMAN GAME

        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e) {
            IO.println("Could not find file");
        }
        catch (IOException e) {
            IO.println("Something went wrong");
        }

        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        IO.println("()()()()()()()()()()()()");
        IO.println("Welcome to java HangGame");
        IO.println("()()()()()()()()()()()()");


        while(wrongGuesses < 6) {

            IO.println(getHangmanArt(wrongGuesses));

            IO.println("Word: ");
            for (char c : wordState){
                IO.print(c + " ");
            }
            IO.println();

            IO.println("Guess the letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0) {
                IO.println("Correct guess !\n");

                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')){
                    IO.print(getHangmanArt(wrongGuesses));
                    IO.println("YOU WIN");
                    IO.println("The word was: " + word);
                    break;
                }
            } else {
                wrongGuesses++;
                IO.println("Wrong guess!\n");
            }
        }

        if(wrongGuesses >= 6) {
            IO.print(getHangmanArt(wrongGuesses));
            IO.println("GAME OVER!");
            IO.println("The word was: " + word);
        }
        scanner.close();
    }
    static String getHangmanArt(int wrongGuess){

        return switch (wrongGuess){
            case 0 -> """
                    
                    
                    
                    
                    """;
            case 1 -> """
                     o
                    
                    
                    
                    """;
            case 2 -> """
                     o
                     |
                    
                    """;
            case 3 -> """
                     o
                    /|
                    
                    """;
            case 4 -> """
                     o
                    /|\\
                    
                    """;
            case 5 -> """
                     o
                    /|\\
                    /
                    """;
            case 6 -> """
                     o
                    /|\\
                    / \\
                    """;
            default -> "";
        };
    };
}
