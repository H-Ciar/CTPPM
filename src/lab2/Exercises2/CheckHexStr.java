package lab2.Exercises2;

import java.util.Scanner;

public class CheckHexStr {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hexStr = scan.nextLine();

        boolean isHex = true;

        for(int i=0; i<hexStr.length(); i++) {
            char ch = hexStr.charAt(i);
            if(!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f'))) {
                isHex = false;
                break;
            }
        }

        if(isHex) {
            System.out.println(hexStr + " is a hex string");
        }
        else {
            System.out.println(hexStr + " is NOT a hex string");
        }
    }
}
