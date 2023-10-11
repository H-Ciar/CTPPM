package hw3.moreexcersises;

import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        // Check if the word to be guessed is provided as a command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java WordGuess word");
            return;
        }
        // Get the word to be guessed from the argument
        String word = args[0];
        // Get the length of the word
        int length = word.length();
        // Create a boolean array to indicate the positions of the word that have been guessed correctly
        boolean[] guessed = new boolean[length];
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Initialize the number of trials and the flag for guessing the word
        int trials = 0;
        boolean guessedWord = false;
        // Print the welcome message and the initial state of the word
        System.out.println("Welcome to WordGuess");
        System.out.println("Key in one character or your guess word: ");
        printWord(word, guessed);
        // Loop until the user guesses the word or quits
        while (!guessedWord) {
            // Prompt the user to enter a character or a guess word
            String choice = input.nextLine();
            // Check if the user wants to quit
            if (choice.equals("#")) {
                break;
            }
            // Increment the number of trials
            trials++;
            // Check if the user enters a single character or a guess word
            if (choice.length() == 1) {
                // Get the character entered by the user
                char ch = choice.charAt(0);
                // Check if the character is in the word and update the guessed array accordingly
                checkCharacter(word, ch, guessed);
                // Print the current state of the word
                printWord(word, guessed);
            } else {
                // Check if the user enters the correct word
                if (choice.equals(word)) {
                    // Set the flag to true and print a congratulation message
                    guessedWord = true;
                    System.out.println("Congratulations!");
                    System.out.println("You got it in " + trials + " trials");
                } else {
                    // Print a wrong guess message
                    System.out.println("Wrong! Try again!");
                }
            }
        }
        // Close the scanner
        input.close();
    }

    // A method to print the word with asterisks for unguessed characters
    public static void printWord(String word, boolean[] guessed) {
        for (int i = 0; i < word.length(); i++) {
            if (guessed[i]) {
                System.out.print(word.charAt(i));
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    // A method to check if a character is in the word and update the guessed array accordingly
    public static void checkCharacter(String word, char ch, boolean[] guessed) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                guessed[i] = true;
            }
        }
    }
}

