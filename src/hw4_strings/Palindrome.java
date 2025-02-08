package hw4_strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));
        sc.close();

    }

    public static boolean isPalindrome(String str) {
        boolean isPalindrome = false;
        String reversedString = "";
        for (int i = str.length() - 1; i > -1; i--) {
            reversedString += str.charAt(i);
        }
        if (str.equals(reversedString)) {
            isPalindrome = true;
        }

        return isPalindrome;
    }
}
