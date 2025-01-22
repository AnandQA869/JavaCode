package operators1;

import java.util.Scanner;

public class Palindrom_String_Number {

    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);

        // Input from the user
        System.out.println("Check for Palindrome Number/String");
        original = sc.nextLine();
        int length = original.length();

        // Reversing the input string/number
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // Checking if the input is a palindrome
        if (original.equals(reverse)) {
            System.out.println("number is a palindrome");
        } else {
            System.out.println(" number is not a palindrome");
        }

        
    }
}
