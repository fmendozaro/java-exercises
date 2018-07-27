package hangman;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Game {

    static String gameWord = "";
    static char[] guessWord = {};
    final static byte STRIKES_LIMIT = 50;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte option = 0;
        while(option != 3){
            showMenu();
            option = getOption(input);
            switch(option){
                case 1:
                    setWord(input);
                    break;
                case 2:
                    play(input);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Not a valid option");
            }
        }
    }

    private static void play(Scanner input) {
        System.out.println("You are guessing: " + Arrays.toString(guessWord));
        String guess;
        byte strikes = 0;
        while(STRIKES_LIMIT != strikes){
            System.out.println("Enter a letter: ");
            guess = input.nextLine();
            if (gameWord.contains(guess)){
                guessWord[gameWord.indexOf(guess)] = guess.charAt(0);
            } else {
                System.out.println("Try gain");
                strikes++;
            }
        }
    }

    private static void setWord(Scanner input) {
        System.out.println("Enter the word to guess for player 2: ");
        gameWord = input.nextLine().trim();
        Arrays.fill(guessWord, 0, gameWord.length(), '-');
    }

    private static byte getOption(Scanner input) {
        return Byte.parseByte(input.nextLine());
    }

    public static void showMenu(){
        System.out.println("== Hangman game ==");
        System.out.println("Choose an option");
        System.out.println("1) Player 1 Enter word");
        System.out.println("2) Player 2 Begin game");
        System.out.println("3) Exit");
    }
}
