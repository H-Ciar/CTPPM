package hw3.moreexcersises;

// A program to test if a phrase is a palindrome
import java.util.Scanner; // Import the Scanner class

public class TestPalindromicPhrase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a phrase: "); // Prompt user for input
        String phrase = in.nextLine().toLowerCase(); // Read and convert input to lowercase
        boolean isPalindrome = true; // Initialize a boolean flag for palindrome
        int fIdx = 0; // Initialize a forward index
        int bIdx = phrase.length() - 1; // Initialize a backward index
        while (fIdx < bIdx) { // Loop until the indexes cross over
            char fChar = phrase.charAt(fIdx); // Get the forward character
            char bChar = phrase.charAt(bIdx); // Get the backward character
            if (!Character.isLetter(fChar)) { // If the forward character is not a letter
                fIdx++; // Increment the forward index
            }
            else if (!Character.isLetter(bChar)) { // If the backward character is not a letter
                bIdx--; // Decrement the backward index
            }
            else { // If both characters are letters
                if (fChar != bChar) { // If they are not equal
                    isPalindrome = false; // Set the flag to false
                    break; // Break out of the loop
                }
                fIdx++; // Increment the forward index
                bIdx--; // Decrement the backward index
            }
        }
        System.out.println("\"" + phrase + "\" is " + (isPalindrome ? "" : "not ") + "a palindrome"); // Print the result
        in.close(); // Close the scanner
    }
}

