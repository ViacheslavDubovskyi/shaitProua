package hw4_strings;

import java.util.Scanner;

public class SymbolOccurance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String text = sc.nextLine();
        System.out.println("Enter the Symbol: ");
        char symbol = sc.next().charAt(0);

        int occurrences = findSymbolOccurance(text, symbol);
        System.out.println("Occurances of symbol " + symbol + " is:" + occurrences);
        sc.close();

    }

    public static int findSymbolOccurance(String str, char ch) {
        int occurance = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                occurance++;
            }
        }
        return occurance;
    }
}
