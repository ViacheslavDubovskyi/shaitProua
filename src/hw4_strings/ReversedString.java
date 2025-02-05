package hw4_strings;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String text = sc.nextLine();
        String reversed = stringReverse(text);
        System.out.println(reversed);
        sc.close();

    }

    public static String stringReverse(String input) {
        StringBuilder builder = new StringBuilder(input);
        String reversed = builder.reverse().toString();
//        String reversed = "";
//        for (int i = input.length() - 1; i > -1; i--) {
//            reversed += input.charAt(i);
//        }
        return reversed;
    }
}
