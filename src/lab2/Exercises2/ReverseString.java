import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        // Define Variable
        Scanner in = new Scanner(System.in);
        String inStr;  // input String
        int inStrLen;  // Length of the input String

        // Promt and input as input String
        System.out.println("Enter a String: ");
        inStr = in.next(); // use next() to read a String
        inStrLen = inStr.length();

        System.out.print("The reverse of the String " + inStr + " is ");

        for (int charIdx = inStrLen - 1; charIdx >= 0 ; --charIdx) {
            System.out.print(inStr.charAt(charIdx));
        }
    }

}
