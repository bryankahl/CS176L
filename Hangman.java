import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);String answer = selectRandomWord();
        char[] guessedLetter = new char[answer.length()];
        for (int i = 0; i < guessedLetter.length; i++) {
        	guessedLetter[i] = '_';
        }
        int attempts = 6; 
        boolean gameWon = false;
        while (attempts > 0 && !gameWon) {
            System.out.print("Current word: ");
            for (char letter : guessedLetter) {
                System.out.print(letter + " ");
            }
            System.out.println();
            System.out.println("Attempts remaining: " + attempts);
            System.out.print("Enter a letter: ");
            char guess = scan.next().charAt(0);
            boolean Guess = false;
            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == guess) {
                	guessedLetter[i] = guess;
                    Guess = true;
                }
            }
            if (Guess) {
                System.out.println("Correct");
            } else {
                System.out.println("Wrong. Enter another letter.");
                attempts--;
            }
            gameWon = isWordGuessed(guessedLetter);
            System.out.println();
        }
        if (gameWon) {
            System.out.println("You have found the word: " + answer);
        } else {
            System.out.println("Tries were used up, the word was: " + answer);
        }
    }
    
    private static String selectRandomWord() {
        String[] words = {"math", "science", "english", "history"};
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }
    
    private static boolean isWordGuessed(char[] guessedWord) {
        for (char letter : guessedWord) {
            if (letter == '_') {
                return false;
            }
        }
        return true;
    }
}