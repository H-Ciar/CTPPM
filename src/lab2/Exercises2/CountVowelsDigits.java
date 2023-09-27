package lab2.Exercises2;

import java.util.Scanner;

public class CountVowelsDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        int vowelCount = 0;
        int digitCount = 0;

        String vowels = "aeiouAEIOU";
        String digits = "0123456789";

        for(int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);

            if(vowels.indexOf(ch) != -1) {
                vowelCount++;
            }
            else if(digits.indexOf(ch) != -1) {
                digitCount++;
            }
        }

        double vowelPercent = (double)vowelCount / input.length() * 100;
        double digitPercent = (double)digitCount / input.length() * 100;

        vowelPercent = Math.round(vowelPercent * 100.0) / 100.0;
        digitPercent = Math.round(digitPercent * 100.0) / 100.0;

        System.out.println("Number of vowels: " + vowelCount + " (" + vowelPercent + "%)");
        System.out.println("Number of digits: " + digitCount + " (" + digitPercent + "%)");
    }
}
