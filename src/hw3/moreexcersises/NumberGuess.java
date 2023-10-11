package hw3.moreexcersises;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        // Generate a random number between 0 and 99
        int number = (int) (Math.random() * 100);
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        // Initialize the number of trials and the user's guess
        int trials = 0;
        int guess = -1;
        // Loop until the user guesses the number
        while (guess != number) {
            // Prompt the user to enter a guess
            System.out.print("Key in your guess: ");
            guess = input.nextInt();
            // Increment the number of trials
            trials++;
            // Check if the guess is correct, too high, or too low
            if (guess == number) {
                System.out.println("You got it in " + trials + " trials!");
            } else if (guess > number) {
                System.out.println("Try lower");
            } else {
                System.out.println("Try higher");
            }
        }
        // Close the scanner
        input.close();
    }
}

