package hw3.moreexcersises;

// A program to cipher the Caesar's code
import java.util.Scanner; // Import the Scanner class

public class CaesarCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a plaintext string: "); // Prompt user for input
        String plaintext = in.next().toUpperCase(); // Read and convert input to uppercase
        String ciphertext = ""; // Initialize an empty string for ciphertext
        for (int i = 0; i < plaintext.length(); i++) { // Loop over each character of plaintext
            char ch = plaintext.charAt(i); // Get the current character
            if (ch >= 'A' && ch <= 'W') { // If the character is between 'A' and 'W'
                ch = (char)(ch + 3); // Add 3 to its Unicode value and cast it back to char
            }
            else if (ch == 'X') { // If the character is 'X'
                ch = (char)(ch - 23); // Subtract 23 from its Unicode value and cast it back to char
            }
            else if (ch == 'Y') { // If the character is 'Y'
                ch = (char)(ch - 23); // Subtract 23 from its Unicode value and cast it back to char
            }
            else if (ch == 'Z') { // If the character is 'Z'
                ch = (char)(ch - 23); // Subtract 23 from its Unicode value and cast it back to char
            }
            // Otherwise, keep the character unchanged
            ciphertext += ch; // Append the modified character to the ciphertext
        }
        System.out.println("The ciphertext string is: " + ciphertext); // Print the ciphertext
        in.close(); // Close the scanner
    }
}

