package hw3.moreexcersises;

// A program to implement the exchange cipher
import java.util.Scanner; // Import the Scanner class

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a plaintext string: "); // Prompt user for input
        String plaintext = in.next(); // Read input string
        String ciphertext = ""; // Initialize an empty string for ciphertext
        for (int i = 0; i < plaintext.length(); i++) { // Loop over each character of plaintext
            char ch = plaintext.charAt(i); // Get the current character
            if (ch >= 'A' && ch <= 'M') { // If the character is between 'A' and 'M'
                ch = (char)('M' + ('N' - ch)); // Subtract it from 'N' and add the result to 'M'
            }
            else if (ch >= 'N' && ch <= 'Z') { // If the character is between 'N' and 'Z'
                ch = (char)('N' + ('M' - ch)); // Subtract it from 'M' and add the result to 'N'
            }
            else if (ch >= 'a' && ch <= 'm') { // If the character is between 'a' and 'm'
                ch = (char)('m' + ('n' - ch)); // Subtract it from 'n' and add the result to 'm'
            }
            else if (ch >= 'n' && ch <= 'z') { // If the character is between 'n' and 'z'
                ch = (char)('n' + ('m' - ch)); // Subtract it from 'm' and add the result to 'n'
            }
            // Otherwise, keep the character unchanged
            ciphertext += ch; // Append the modified character to the ciphertext
        }
        System.out.println("The ciphertext string is: " + ciphertext.toUpperCase()); // Print the ciphertext in uppercase
        in.close(); // Close the scanner
    }
}

