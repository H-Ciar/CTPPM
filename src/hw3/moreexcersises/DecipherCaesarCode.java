package hw3.moreexcersises;

// A program to decipher the Caesar's code
import java.util.Scanner; // Import the Scanner class

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a ciphertext string: "); // Prompt user for input
        String ciphertext = in.next().toUpperCase(); // Read and convert input to uppercase
        String plaintext = ""; // Initialize an empty string for plaintext
        for (int i = 0; i < ciphertext.length(); i++) { // Loop over each character of ciphertext
            char ch = ciphertext.charAt(i); // Get the current character
            if (ch >= 'D' && ch <= 'Z') { // If the character is between 'D' and 'Z'
                ch = (char)(ch - 3); // Subtract 3 from its Unicode value and cast it back to char
            }
            else if (ch == 'A') { // If the character is 'A'
                ch = (char)(ch + 23); // Add 23 to its Unicode value and cast it back to char
            }
            else if (ch == 'B') { // If the character is 'B'
                ch = (char)(ch + 23); // Add 23 to its Unicode value and cast it back to char
            }
            else if (ch == 'C') { // If the character is 'C'
                ch = (char)(ch + 23); // Add 23 to its Unicode value and cast it back to char
            }
            // Otherwise, keep the character unchanged
            plaintext += ch; // Append the modified character to the plaintext
        }
        System.out.println("The plaintext string is: " + plaintext); // Print the plaintext
        in.close(); // Close the scanner
    }
}
